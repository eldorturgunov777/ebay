package com.example.ebay.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ebay.R;
import com.example.ebay.model.GridModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eldor Turgunov on 22.05.2022.
 * ebay
 * eldorturgunov777@gmail.com
 */
public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder> {
    Context context;
    List<GridModel> list = new ArrayList<>();

    public VerticalAdapter(Context context, List<GridModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_vertical, parent, false);
        return new VerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
        GridModel data = list.get(position);
        holder.imageView.setImageResource(data.getImg());
        holder.title.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

        public static class VerticalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;

        public VerticalViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_grid);
            title = itemView.findViewById(R.id.tv_grid);
        }
    }
}

