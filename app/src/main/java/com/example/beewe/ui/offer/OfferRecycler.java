package com.example.beewe.ui.offer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beewe.R;

public class OfferRecycler extends RecyclerView.Adapter<OfferRecycler.ViewHolder> {

    private OfferCons[] offerCons;

    public OfferRecycler(OfferCons[] offerr)
    {
        this.offerCons = offerr;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View list =layoutInflater.inflate(R.layout.offer_recycler, parent, false);
        ViewHolder abc = new ViewHolder(list);
        return abc;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final OfferCons data =offerCons[position];
        holder.text_a.setText(data.getText_a());
        holder.text_b.setText(data.getText_b());
        holder.text_c.setText(data.getText_c());
        holder.text_d.setText(data.getText_d());
        holder.btn_a.setText(data.getBtn_a());
        holder.image.setBackgroundResource(data.getImage());
    }

    @Override
    public int getItemCount() {
        return offerCons.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView text_a, text_b, text_c, text_d;
        public ImageView image;
        public Button btn_a;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_a = itemView.findViewById(R.id.text_a);
            text_b = itemView.findViewById(R.id.text_b);
            text_c = itemView.findViewById(R.id.lol);
            text_d = itemView.findViewById(R.id.lol_a);
            image = itemView.findViewById(R.id.image);
            btn_a = itemView.findViewById(R.id.btn_a);
        }
    }
}
