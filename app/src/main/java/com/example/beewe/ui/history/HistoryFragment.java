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
import com.example.beewe.ui.offer.OfferRecycler;
import com.google.android.material.tabs.TabLayout;

public class HistoryFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



//        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_history, container, false);
//        HistoryCons mon[] = new HistoryCons[]{
//                new HistoryCons("Peterson", "00-JAN-0000 00:00 a.m", "+15234517810","View"),
//                new HistoryCons("Johnson", "00-JAN-0000 00:00 a.m", "+15234517810","View"),
//                new HistoryCons("Peterson", "00-JAN-0000 00:00 a.m", "+15234517810","View"),
//                new HistoryCons("Johnson", "00-JAN-0000 00:00 a.m", "+15234517810","View"),
//                new HistoryCons("Peterson", "00-JAN-0000 00:00 a.m", "+15234517810","View"),
//        };
//
//        RecyclerView recyclerView = view.findViewById(R.id.bewee_recycler);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        HistoryAdapter historyAdapter = new HistoryAdapter(mon);
//        recyclerView.setAdapter(historyAdapter);




        tabLayout = view.findViewById(R.id.toolbar_abc);
        viewPager = view.findViewById(R.id.tab_history);
        tabLayout.addTab(tabLayout.newTab().setText("Send Money"));
        tabLayout.addTab(tabLayout.newTab().setText("Receive Money"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final TabAdapter adapter = new TabAdapter(getContext(),getParentFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

       return view;
    }
}