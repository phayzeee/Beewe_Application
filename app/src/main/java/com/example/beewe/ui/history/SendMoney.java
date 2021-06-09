package com.example.beewe.ui.history;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beewe.R;
import com.google.android.material.tabs.TabLayout;


public class SendMoney extends Fragment {

    HistoryCons mon[];
    RecyclerView recyclerView;
    HistoryAdapter historyAdapter;

    public SendMoney() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_send_money, container, false);
         mon = new HistoryCons[]{
                new HistoryCons("Peterson", "00-JAN-0000 00:00 a.m", "+15234517810","View"),
        };

        recyclerView = view.findViewById(R.id.bewee_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        historyAdapter = new HistoryAdapter(mon, getContext());
        recyclerView.setAdapter(historyAdapter);
        return view;
    }
}