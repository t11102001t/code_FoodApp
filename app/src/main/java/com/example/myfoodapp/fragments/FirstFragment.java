package com.example.myfoodapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.FeaturedAdapter;
import com.example.myfoodapp.adapters.FeaturedVerAdapter;
import com.example.myfoodapp.models.FeaturedModal;
import com.example.myfoodapp.models.FeaturedVerModal;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

//    featured hor RecycleView
    List<FeaturedModal> featuredModalList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

//    featured ver RecycleView
    List<FeaturedVerModal> featuredVerModalList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

//        featured hor recycleView
        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModalList = new ArrayList<>();

        featuredModalList.add(new FeaturedModal(R.drawable.fav1,"Feature 1","Description 1"));
        featuredModalList.add(new FeaturedModal(R.drawable.fav2,"Feature 2","Description 2"));
        featuredModalList.add(new FeaturedModal(R.drawable.fav3,"Feature 3","Description 3"));

        featuredAdapter = new FeaturedAdapter(featuredModalList);
        recyclerView.setAdapter(featuredAdapter);

        //        featured ver recycleView
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModalList = new ArrayList<>();

        featuredVerModalList.add(new FeaturedVerModal(R.drawable.ver1,"Featured 1", "Description 1","4.8","10:00 - 20:00"));
        featuredVerModalList.add(new FeaturedVerModal(R.drawable.ver2,"Featured 2", "Description 2","5.0","10:00 - 20:00"));
        featuredVerModalList.add(new FeaturedVerModal(R.drawable.ver3,"Featured 3", "Description 3","4.5","10:00 - 20:00"));
        featuredVerModalList.add(new FeaturedVerModal(R.drawable.ver1,"Featured 1", "Description 1","4.8","10:00 - 20:00"));
        featuredVerModalList.add(new FeaturedVerModal(R.drawable.ver2,"Featured 2", "Description 2","5.0","10:00 - 20:00"));
        featuredVerModalList.add(new FeaturedVerModal(R.drawable.ver3,"Featured 3", "Description 3","4.5","10:00 - 20:00"));


        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModalList);
        recyclerView2.setAdapter(featuredVerAdapter);
        return view;

    }
}