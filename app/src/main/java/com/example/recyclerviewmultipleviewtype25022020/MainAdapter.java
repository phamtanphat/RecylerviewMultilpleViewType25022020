package com.example.recyclerviewmultipleviewtype25022020;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private int COUNT_ROW = 2;

    private ArrayList<Integer> mArrayListImage;
    private ArrayList<Integer> mArrayListFood;

    public MainAdapter() {
        mArrayListImage = new ArrayList<>();
        mArrayListFood = new ArrayList<>();
    }

    public void submitListImage(ArrayList<Integer> images){
        if (images != null && images.size() > 0){
            if (mArrayListImage.size() > 0){
                mArrayListImage.clear();
                mArrayListImage.addAll(images);
            }
        }
        notifyDataSetChanged();
    }
    public void submitListFood(ArrayList<Integer> foods){
        if (foods != null && foods.size() > 0){
            if (mArrayListFood.size() > 0){
                mArrayListFood.clear();
                mArrayListFood.addAll(foods);
            }
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return COUNT_ROW;
    }

    class ImageHolder extends RecyclerView.ViewHolder{
        ImageView mImgBanner;
        public ImageHolder(@NonNull View itemView) {
            super(itemView);
            mImgBanner = itemView.findViewById(R.id.imageviewBanner);
        }
    }
    class ListFoodHolder extends RecyclerView.ViewHolder{
        RecyclerView mRcvFood;
        public ListFoodHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
