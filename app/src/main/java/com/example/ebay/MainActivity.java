package com.example.ebay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import com.example.ebay.adapter.VerticalAdapter;
import com.example.ebay.adapter.HorizontalAdapter;
import com.example.ebay.model.GridModel;
import com.example.ebay.model.ListData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec1;
    RecyclerView rec2;
    List<ListData> list = new ArrayList<>();
    List<GridModel> gridModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec1 = findViewById(R.id.recyclerView);
        rec2 = findViewById(R.id.recyclerViewVertical);
        rec2.setHasFixedSize(true);
        rec2.setLayoutManager(new GridLayoutManager(this, 3));
        VerticalAdapter verticalAdapter = new VerticalAdapter(this, gridModels);
        rec2.setAdapter(verticalAdapter);
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
        gridModels.add(new GridModel(R.drawable.headphones2, "Heaters"));
        gridModels.add(new GridModel(R.drawable.headphones3, "Generators"));
        gridModels.add(new GridModel(R.drawable.headphones4, "Snowblowers"));
        gridModels.add(new GridModel(R.drawable.headphones5, "Generators"));
        gridModels.add(new GridModel(R.drawable.headphones6, "Thermostats"));
    }
}