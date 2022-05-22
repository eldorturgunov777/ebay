package com.example.ebay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import com.example.ebay.adapter.GridAdapter;
import com.example.ebay.adapter.HorizontalAdapter;
import com.example.ebay.model.GridModel;
import com.example.ebay.model.ListData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec1;
    List<ListData> list = new ArrayList<>();
    List<GridModel> gridModels = new ArrayList<>();
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec1 = findViewById(R.id.recyclerView);
        gridView = findViewById(R.id.gridview);
        GridAdapter gridAdapter = new GridAdapter(this, gridModels);
        gridView.setAdapter(gridAdapter);
        rec1.setHasFixedSize(true);
        rec1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        HorizontalAdapter adapter = new HorizontalAdapter(this, list);
        rec1.setAdapter(adapter);
        data();
        gridData();
    }

    private void data() {
        list.add(new ListData(R.drawable.headphones1, "Bose QuietComfort EarBuds", "$399.00", "$149.00", "72"));
        list.add(new ListData(R.drawable.headphones2, "Bose QuietComfort", "$399.00", "$149.00", "72"));
        list.add(new ListData(R.drawable.headphones3, "Bose QuietComfort EarBuds", "$399.00", "$149.00", "72"));
        list.add(new ListData(R.drawable.headphones4, "Bose QuietComfort EarBuds", "$399.00", "$149.00", "72"));
        list.add(new ListData(R.drawable.headphones5, "Bose QuietComfort", "$399.00", "$149.00", "72"));
        list.add(new ListData(R.drawable.headphones6, "Bose QuietComfort EarBuds", "$399.00", "$149.00", "72"));
    }

    private void gridData() {
        gridModels.add(new GridModel(R.drawable.headphones1, "Bloks"));
        gridModels.add(new GridModel(R.drawable.headphones2, "Bloks"));
        gridModels.add(new GridModel(R.drawable.headphones3, "Bloks"));
        gridModels.add(new GridModel(R.drawable.headphones4, "Bloks"));
        gridModels.add(new GridModel(R.drawable.headphones5, "Bloks"));
        gridModels.add(new GridModel(R.drawable.headphones6, "Bloks"));
    }
}