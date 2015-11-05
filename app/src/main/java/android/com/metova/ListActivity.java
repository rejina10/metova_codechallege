package android.com.metova;

import android.app.ProgressDialog;
import android.com.metova.customadapter.SearchListAdapter;
import android.com.metova.net.DDGClient;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import com.google.gson.Gson;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rejina on 11/2/2015.
 */
public class ListActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mSearchListAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressDialog progress_dialog = null;
    private SearchModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchlist);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String searchText = intent.getStringExtra("SearchText");

        getSupportActionBar().setTitle(searchText);
        toolbar.setNavigationIcon(R.drawable.ic_action);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        MyTask task = new MyTask();
        task.execute(searchText);

    }



    private class MyTask extends AsyncTask<String, Reader, List<SearchModel.RelatedTopicsEntity>> {
        @Override
        protected void onPreExecute() {
            progress_dialog = ProgressDialog.show(ListActivity.this, "Please wait.....", "downloading data");
        }

        @Override
        protected List<SearchModel.RelatedTopicsEntity> doInBackground(String... params) {
            List<SearchModel.RelatedTopicsEntity> result = new ArrayList<>();
            Reader data = DDGClient.getData(params[0]);
            Gson gson =new Gson();
            if (data != null) {
                model = gson.fromJson(data, SearchModel.class);
                result = model.getRelatedTopics();
            }
            return result;
        }

        @Override
        protected void onPostExecute(List<SearchModel.RelatedTopicsEntity> result){
            super.onPostExecute(result);
            progress_dialog.dismiss();
            if(result  == null){
                Toast.makeText(getApplicationContext(), "No results found", Toast.LENGTH_LONG).show();
                return;
            }
            mSearchListAdapter = new SearchListAdapter(result);
            mRecyclerView.setAdapter(mSearchListAdapter);

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        setResult(1000);
        finish();
    }
}
