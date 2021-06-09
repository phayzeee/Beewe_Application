package com.example.beewe.ui.history;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    Context context;
    int totaltabs;
    public TabAdapter(Context c,@NonNull FragmentManager fm, int totaltabs) {
        super(fm);
        context = c;
        this.totaltabs = totaltabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SendMoney footballFragment = new SendMoney();
                return footballFragment;
            case 1:
                SendMoney cricketFragment = new SendMoney();
                return cricketFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totaltabs;
    }
}
