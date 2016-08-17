package com.example.minaxipc.tab;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManagerNonConfig;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by MINAXI PC on 8/16/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments=new ArrayList<>();
    ArrayList<String>tabTitles=new ArrayList<>();
    public void addFragments(HomeFragment fragments, String Titles){
        this.fragments.add(fragments);
        this.tabTitles.add(Titles);
    }

    public ViewPagerAdapter(FragmentManager fm){
        super(fm);

    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }


    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles.get(position);
    }
}