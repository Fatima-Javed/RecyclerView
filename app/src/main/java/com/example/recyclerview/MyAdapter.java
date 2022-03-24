package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;
    ArrayList<News>newsArrayList;

    public MyAdapter(Context context, ArrayList<News> newsArrayList) {
        this.context = context;
        this.newsArrayList = newsArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.list_view,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        News news= newsArrayList.get(position);
        holder.textview1.setText(news.heading);
        holder.title_image.setImageResource(news.title_image);

    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();


    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textview1;
        ShapeableImageView title_image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textview1=itemView.findViewById(R.id.textview1);
            title_image=itemView.findViewById(R.id.title_image);

        }
    }
}
