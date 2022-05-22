package com.example.ebay.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ebay.R;
import com.example.ebay.model.GridModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eldor Turgunov on 22.05.2022.
 * ebay
 * eldorturgunov777@gmail.com
 */
public class GridAdapter extends BaseAdapter {
    Context context;
    List<GridModel> list = new ArrayList<>();

    public GridAdapter(Context context, List<GridModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        @SuppressLint("ViewHolder") View listitemView = LayoutInflater.from(context).inflate(R.layout.item_gridview, viewGroup, false);

        GridModel data = list.get(position);
        ImageView imageView = listitemView.findViewById(R.id.img_grid);
        TextView textView = listitemView.findViewById(R.id.tv_grid);
        imageView.setImageResource(data.getImg());
        textView.setText(data.getTitle());
        return null;
    }
}

