package com.android.exercise6.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.android.exercise6.R;
import com.android.exercise6.model.ViewPagerAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Khang on 07/12/2015.
 */
public class PostListActivity extends AppCompatActivity {
    private static final String TAG = "PostListActivity";


    @Bind(R.id.sliding_tabs)
    TabLayout slidingTabs;
    @Bind(R.id.viewpager)
    ViewPager viewpager;

    ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);

        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(mViewPagerAdapter);
        slidingTabs.setupWithViewPager(viewpager);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }
}
