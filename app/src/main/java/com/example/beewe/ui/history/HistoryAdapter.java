package com.example.beewe.ui.history;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beewe.R;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {

    private HistoryCons[] moneydata;
    private Context context;

    public HistoryAdapter(HistoryCons[] moneydata, Context context) {
        this.moneydata = moneydata;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View list =layoutInflater.inflate(R.layout.history_recycler, parent, false);
        return new ViewHolder(list);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final HistoryCons mond = moneydata[position];
        holder.text_z.setText(mond.getText_z());
        holder.text_x.setText(mond.getText_x());
        holder.text_c.setText(mond.getText_c());
        holder.textv.setText(mond.getTextv());

    }
    @Override
    public int getItemCount() {
        return moneydata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView text_z, text_x, text_c, textv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_z = itemView.findViewById(R.id.person_name);
            text_x = itemView.findViewById(R.id.date);
            text_c = itemView.findViewById(R.id.contact);
            textv = itemView.findViewById(R.id.view);
            textv.setPaintFlags(textv.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        }
    }

}
