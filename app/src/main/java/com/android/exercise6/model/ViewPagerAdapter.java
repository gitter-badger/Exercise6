package com.android.exercise6.model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.exercise6.fragment.PostInTopicFragment;

/**
 * Created by Khang on 07/12/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private static final String TAG = "ViewPagerAdapter";
    private static final String[] topics =
            new String[]{"androiddev","movies","pics","food","music","comic"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        return PostInTopicFragment.newInstance(topics[position]);
    }

    @Override
    public int getCount() {
        return topics.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return topics[position];
    }
}
