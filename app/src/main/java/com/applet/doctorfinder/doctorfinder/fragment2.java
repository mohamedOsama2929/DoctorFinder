package com.applet.doctorfinder.doctorfinder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by doyde on 10/11/2017.
 */

public  class fragment2 extends Fragment {

    private static RecyclerView recyclerView;
    private postAdapter postAdapter;
    private ArrayList<reviewpost> posts;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View v=inflater.inflate(R.layout.frag2,container,false);
        recyclerView=(RecyclerView) v.findViewById(R.id.reciclview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        posts=new ArrayList<>();
        for (int i=0; i<10 ; i++){
            posts.add(new reviewpost("Vistor Name " , "He is agreat doctor with excellent qualification,I recomnded\n" +
                    "him to everyone","","Monday, 20 janury 2017"));
        }

        postAdapter=new postAdapter(getContext(),posts);
        recyclerView.setAdapter(postAdapter);
    }
}
