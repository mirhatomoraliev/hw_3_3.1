package com.example.hw_3_31;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VillagesAdapter extends RecyclerView.Adapter<VillagesViewHolder> {

    private ArrayList<String> listVillages;

    public VillagesAdapter(ArrayList<String> listVillages) {
        this.listVillages = listVillages;
    }

    @NonNull
    @Override
    public VillagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VillagesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_villages, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VillagesViewHolder holder, int position) {
        holder.bind(listVillages.get(position));
    }

    @Override
    public int getItemCount() {
        return listVillages.size();
    }
}
