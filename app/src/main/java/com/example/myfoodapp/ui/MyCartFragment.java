package com.example.myfoodapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.CartAdapter;
import com.example.myfoodapp.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.card_rec);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.s1,"Order 1","30","4.3"));
        list.add(new CartModel(R.drawable.s2,"Order 1","$20","4.6"));
        list.add(new CartModel(R.drawable.fav1,"Order 1","40","4.5"));
        list.add(new CartModel(R.drawable.s1,"Order 1","$30","4.7"));
        list.add(new CartModel(R.drawable.s2,"Order 1","$0","4.2"));
        list.add(new CartModel(R.drawable.fav2,"Order 1","30","4.3"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }
}