package com.example.hw_3_31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> villagesList;
    private  VillagesAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_villages);
        loadData();
        adapter = new VillagesAdapter(villagesList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        villagesList = new ArrayList<>();
        villagesList.add("Sheker");
        villagesList.add("Kok say");
        villagesList.add("Archagul");
        villagesList.add("Kainar");
        villagesList.add("Tup");
        villagesList.add("Groznyi");
        villagesList.add("Maimak");
        villagesList.add("Ak dobo");
        villagesList.add("Kant");
        villagesList.add("Chip");
        villagesList.add("Cola");
    }
}