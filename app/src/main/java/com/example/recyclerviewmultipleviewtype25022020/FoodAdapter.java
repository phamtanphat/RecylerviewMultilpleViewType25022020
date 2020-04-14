package com.example.recyclerviewmultipleviewtype25022020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ItemHolder>{

    private ArrayList<FoodModel> mFoodModelArrayList;

    public FoodAdapter() {
        mFoodModelArrayList = new ArrayList<>();
    }
    public void submitData(ArrayList<FoodModel> foodModelArrayList){
        if (foodModelArrayList != null){
            if (mFoodModelArrayList.size() > 0){
                mFoodModelArrayList.clear();
                mFoodModelArrayList.addAll(foodModelArrayList);
            }else{
                mFoodModelArrayList.addAll(foodModelArrayList);
            }
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout_food, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        FoodModel foodModel = mFoodModelArrayList.get(position);
        holder.mTvName.setText(foodModel.getName());
        DecimalFormat decimalFormat = new DecimalFormat("###.###.###");
        holder.mTvPrice.setText("$ "+ decimalFormat.format(foodModel.getPrice()));
        holder.mImg.setImageResource(foodModel.getImage());
        holder.mTvDesribe.setText(foodModel.getDescribe());
    }

    @Override
    public int getItemCount() {
        return mFoodModelArrayList.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder{
        ImageView mImg;
        TextView mTvName,mTvPrice,mTvDesribe;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.imageviewFood);
            mTvName = itemView.findViewById(R.id.textviewNameFood);
            mTvPrice = itemView.findViewById(R.id.textviewPriceFood);
            mTvDesribe = itemView.findViewById(R.id.textviewDescribeFood);
        }
    }
}
