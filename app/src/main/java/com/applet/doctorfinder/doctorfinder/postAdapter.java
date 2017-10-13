package com.applet.doctorfinder.doctorfinder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by doyde on 10/12/2017.
 */

public class postAdapter extends RecyclerView.Adapter<postAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title,desc,date;
        public ViewHolder(View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.title);
            date=(TextView) itemView.findViewById(R.id.dayofreview);
            desc=(TextView) itemView.findViewById(R.id.descrp);
        }
    }
    private Context context;
    private List<reviewpost>posts;
    public postAdapter(Context c, List<reviewpost> postlist) {
        this.context = c;
        posts = postlist;
    }

    @Override
    public postAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View v=  LayoutInflater.from(context).inflate(R.layout.patient_reviews,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(postAdapter.ViewHolder holder, int position) {
        reviewpost p =posts.get(position);
        holder.title.setText(p.getTitle());
        holder.desc.setText(p.getDescri());
        holder.date.setText(p.getDate());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
