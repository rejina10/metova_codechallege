package android.com.metova;



import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by rejina on 11/2/2015.
 */

public class MainActivity extends AppCompatActivity {

    private MenuItem mSearchAction;
    private Drawable mIconOpenSearch;
    private Drawable mIconCloseSearch;
    private Toolbar toolbar;
    private boolean isSearchBarOpen = false;
    private EditText mSearchEt = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
         getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if(id == R.id.menu_search){
            openSearchBar();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }//

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        mSearchAction = menu.findItem(R.id.menu_search);
        return super.onPrepareOptionsMenu(menu);
    }

    private void openSearchBar() {

        if (isSearchBarOpen == false) {
            // Set custom view on action bar.
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setCustomView(R.layout.search_bar);

            // Search edit text field setup.
            mSearchEt = (EditText) getSupportActionBar().getCustomView().findViewById(R.id.editTextSearch);
            mSearchEt.requestFocus();

            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(mSearchEt, InputMethodManager.SHOW_IMPLICIT);

            //mSearchAction.setIcon(mIconCloseSearch);
            isSearchBarOpen = true;
        } else {
            //search the text keyed in
            String searchText = mSearchEt.getText().toString();

            if(searchText.isEmpty()){
                Toast.makeText(getApplicationContext(), "Field required", Toast.LENGTH_LONG).show();
                return;
            }
            Intent intent = new Intent(this, ListActivity.class);
            intent.putExtra("SearchText", searchText);
            startActivityForResult(intent, 1000);


        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000){
            getSupportActionBar().setDisplayShowCustomEnabled(false);
            isSearchBarOpen = false;

        }
    }
}
