package com.example.recucler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final LayoutInflater cont;
    private final List<Nadpis> foto;

    public RecyclerViewAdapter(Context context, List<Nadpis> movies )
    {
        this.foto = movies;
        this.cont = LayoutInflater.from(context);
    }

    @NonNull
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = cont.inflate(R.layout.scrol, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Nadpis model = foto.get(position);
        holder.imgView.setImageResource(model.getImg());
        holder.nameMov.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return foto.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView imgView;
        final TextView nameMov;

        ViewHolder(View view)
        {
            super(view);
            imgView = view.findViewById(R.id.img);
            nameMov = view.findViewById(R.id.textV);
        }
    }
}
