package com.example.pcapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DialogAdapter extends RecyclerView.Adapter<DialogAdapter.ViewHolder> {
    private ArrayList<Dilemma> dilemmaList;
    private static DialogAdapter adapter = null;

    public DialogAdapter() {
        this.dilemmaList = DilemmaCollection.getInstance().getDilemmas();
    }

    public static DialogAdapter getInstance() {
        if (adapter == null) {
            adapter = new DialogAdapter();
        }
        return adapter;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dilemma_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DialogAdapter.ViewHolder holder, int position) {
        String desc = dilemmaList.get(position).getDilemmaDesc();
        holder.setData(desc);
    }

    @Override
    public int getItemCount() {
        return dilemmaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textdesc;
        private ImageView img;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textdesc = itemView.findViewById(R.id.dilemmaText);
            img = itemView.findViewById(R.id.dilemmaImage);
        }

        public void setData(String desc) {
            textdesc.setText(desc);
            img.setImageResource(R.drawable.ic_launcher_background);
        }
    }

}
