package com.applet.doctorfinder.doctorfinder.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.applet.doctorfinder.doctorfinder.R;

/**
 * Created by amran on 10/13/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView doctorImage;
        public ImageView rating;
        public ImageView specilaizedIn;
        public ImageView fees;
        public ImageView waitingHours;
        public ImageView address;

        public TextView doctorName;
        public TextView doctorStudy;
        public TextView specilaizedInTxt;
        public TextView feesTxt;
        public TextView timeTxt;
        public TextView addressTxt;

        public Button bookBtn;
        public Button profileBtn;

        public ViewHolder(View itemView){

            super(itemView);

            doctorImage = (ImageView) itemView.findViewById(R.id.doctorImage);
            rating = (ImageView) itemView.findViewById(R.id.rating);
            specilaizedIn = (ImageView) itemView.findViewById(R.id.specializedIn);
            fees = (ImageView) itemView.findViewById(R.id.fees);
            waitingHours = (ImageView) itemView.findViewById(R.id.WaitingHours);
            address = (ImageView) itemView.findViewById(R.id.address);

            doctorName = (TextView) itemView.findViewById(R.id.doctorName);
            doctorStudy = (TextView) itemView.findViewById(R.id.doctorStudy);
            specilaizedInTxt = (TextView) itemView.findViewById(R.id.specializedInTxt);
            feesTxt = (TextView) itemView.findViewById(R.id.feesTxt);
            timeTxt = (TextView) itemView.findViewById(R.id.timeTxt);
            addressTxt = (TextView) itemView.findViewById(R.id.addressTxt);

            bookBtn = (Button) itemView.findViewById(R.id.theBookBtn);
            profileBtn = (Button) itemView.findViewById(R.id.theProfileBtn);
        }
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_result_design,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {return 5;}


}
