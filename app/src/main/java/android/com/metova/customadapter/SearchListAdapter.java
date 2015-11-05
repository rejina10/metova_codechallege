package android.com.metova.customadapter;

import android.com.metova.R;
import android.com.metova.SearchModel;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rejina on 11/3/2015.
 */
public class SearchListAdapter extends RecyclerView.Adapter<SearchListAdapter.ViewHolder> {

    private List<SearchModel.RelatedTopicsEntity> data;

    public SearchListAdapter(List<SearchModel.RelatedTopicsEntity> data){
       this.data = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private TextView mHeading;
        private TextView mDefinition;
        private ImageView mthumbnail;
        private TextView mDescription;

        public ViewHolder(View viewItem) {
            super(viewItem);
            //mHeading      = (TextView)viewItem.findViewById(R.id.heading);
            mDefinition   =(TextView)viewItem.findViewById(R.id.definition);
            mthumbnail    = (ImageView)viewItem.findViewById(R.id.thumbnail);
            mDescription  = (TextView)viewItem.findViewById(R.id.description);
        }
    }

    @Override
    public SearchListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.eachsearch_list, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override

    public void onBindViewHolder(ViewHolder holder, int position) {

        SearchModel.RelatedTopicsEntity info = data.get(position);
        //holder.mHeading.setText(info.getHeading());
        holder.mDefinition.setText(info.getFirstURL());
        holder.mDescription.setText(info.getText());
        if(info.getIcon() != null){
            String url = info.getIcon().getURL();
            Uri uri = Uri.parse(url);
            Context context = holder.mthumbnail.getContext();
            Picasso.with(context).load(uri).into(holder.mthumbnail);
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
