package com.example.ebay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ebay.R;
import com.example.ebay.model.ListData;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eldor Turgunov on 22.05.2022.
 * ebay
 * eldorturgunov777@gmail.com
 */
public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {
    Context context;
    List<ListData> list = new ArrayList<>();

    public HorizontalAdapter(Context context, List<ListData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_horizontal, parent, false);
        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
        ListData data = list.get(position);
        holder.img_horizontal.setImageResource(data.getImg());
        holder.title_horizontal.setText(data.getTitle());
        holder.price.setText(data.getPrice());
        holder.discount.setText(data.getDiscount());
        holder.percent.setText(data.getPercent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class HorizontalViewHolder extends RecyclerView.ViewHolder {
        ImageView img_horizontal;
        TextView title_horizontal;
        TextView price;
        TextView discount;
        TextView percent;

        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            img_horizontal = itemView.findViewById(R.id.img_horizontal);
            title_horizontal = itemView.findViewById(R.id.title_horizontal);
            price = itemView.findViewById(R.id.price);
            discount = itemView.findViewById(R.id.discount);
            percent = itemView.findViewById(R.id.percent);
        }
    }
}
