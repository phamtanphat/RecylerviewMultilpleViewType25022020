package com.example.recyclerviewmultipleviewtype25022020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvMultipleViewType;
    MainAdapter mainAdapter;
    ArrayList<Integer> mArrayBanners;
    ArrayList<FoodModel> mArrayFoodModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRcvMultipleViewType = findViewById(R.id.recyclerview);
        mArrayBanners = new ArrayList<>();
        mArrayBanners.add(R.drawable.banner1);
        mArrayBanners.add(R.drawable.banner2);
        mArrayBanners.add(R.drawable.banner3);

        mArrayFoodModels = FoodModel.mock();
        mainAdapter = new MainAdapter(mArrayBanners,mArrayFoodModels);
        mRcvMultipleViewType.setAdapter(mainAdapter);




    }
}
