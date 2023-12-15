package com.example.myfoodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DetailedDailyAdapter;
import com.example.myfoodapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);


        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);
        
        recyclerView = findViewById(R.id.detailed_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"breakfast","description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"breakfast","description","4.4","40","10 to 9"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"breakfast","description","4.4","40","10 to 9"));

            dailyAdapter.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("sweets")){

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Sweets","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Sweets","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Sweets","description","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"Sweets","description","4.4","40","10am to 9pm"));

            dailyAdapter.notifyDataSetChanged();
        }
    }
}