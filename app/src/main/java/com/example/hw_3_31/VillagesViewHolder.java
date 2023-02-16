package com.example.hw_3_31;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VillagesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvVillages;
    public VillagesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvVillages = itemView.findViewById(R.id.tv_villages);
    }
    void bind(String villages){
        tvVillages.setText(villages);
    }
}
