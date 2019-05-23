package com.example.utsakb10116319;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class pagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public pagerAdapter(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                profilFragment profilFragment = new profilFragment();
                return profilFragment;

            case 1:
                kontakFragment kontakFragment = new kontakFragment();
                return kontakFragment;

            case 2:
                friendsFragment friendsFragment = new friendsFragment();
                return friendsFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}

