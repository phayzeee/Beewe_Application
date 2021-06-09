package com.example.beewe.ui.offer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beewe.R;


public class OfferFragment extends Fragment {



    public OfferFragment() {
        // Required empty public constructor
    }
    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_offer, container, false);
        OfferCons offers[] = new OfferCons[]{
                new OfferCons("Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", "get 00% discount", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", "Read More", R.drawable.ic_bhago),
                new OfferCons("Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", "get 00% discount", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", "Read More",R.drawable.ic_bhagbc),
                new OfferCons("Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", "Rs. 0 per day", "Lorem Ipsum is simply dummy text of the printing and typesetting industry", "Read More", R.drawable.ic_polp),

        };
        recyclerView = view.findViewById(R.id.bewe_recycl);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        OfferRecycler offerRecycler = new OfferRecycler(offers);
        recyclerView.setAdapter(offerRecycler);
        return view;
    }

}