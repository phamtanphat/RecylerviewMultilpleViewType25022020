package com.example.recyclerviewmultipleviewtype25022020;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private int COUNT_ROW = 2;

    private ArrayList<Integer> mArrayListImage;
    private ArrayList<FoodModel> mArrayListFood;

    private final int BANNER_TYPE = 0;
    private final int LIST_FOOD_TYPE = 1;

    public MainAdapter(ArrayList<Integer> mArrayListImage, ArrayList<FoodModel> mArrayListFood) {
        this.mArrayListImage = mArrayListImage;
        this.mArrayListFood = mArrayListFood;
    }


    @Override
    public int getItemViewType(int position) {
        switch (position){
            case 0 :
                return BANNER_TYPE;
            default:
                return LIST_FOOD_TYPE;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = null;
        switch (viewType){
            case BANNER_TYPE :
                view = layoutInflater.inflate(R.layout.item_layout_banner, parent, false);
                return new BannerHolder(view);
            default:
                view = layoutInflater.inflate(R.layout.layout_recyclerview, parent, false);
                return new ListFoodHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof BannerHolder){
            ((BannerHolder)holder).bind(mArrayListImage);
        }else{
            ((ListFoodHolder)holder).bind(mArrayListFood);
        }
    }

    @Override
    public int getItemCount() {
        return COUNT_ROW;
    }

    class BannerHolder extends RecyclerView.ViewHolder{
        ImageView mImgBanner;
        public BannerHolder(@NonNull View itemView) {
            super(itemView);
            mImgBanner = itemView.findViewById(R.id.imageviewBanner);
        }
        void bind(ArrayList<Integer> images){
            if (images.size() > 0)
            mImgBanner.setImageResource(images.get(0));
        }
    }
    class ListFoodHolder extends RecyclerView.ViewHolder{
        RecyclerView mRcvFood;
        FoodAdapter mFoodAdapter;
        public ListFoodHolder(@NonNull View itemView) {
            super(itemView);
            mRcvFood = itemView.findViewById(R.id.recyclerviewListFood);
            mFoodAdapter = new FoodAdapter();
            mRcvFood.setHasFixedSize(true);
            mRcvFood.addItemDecoration(new DividerItemDecoration(itemView.getContext(),DividerItemDecoration.VERTICAL));
            mRcvFood.setAdapter(mFoodAdapter);
        }
        void bind(ArrayList<FoodModel> foodModels){
            mFoodAdapter.submitData(foodModels);
        }
    }
}
