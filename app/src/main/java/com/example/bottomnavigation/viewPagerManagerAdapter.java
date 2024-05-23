package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPagerManagerAdapter extends FragmentPagerAdapter {

    public viewPagerManagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new SearchFragment();
        } else if (position == 2) {
            return new SettingFragment();
        } else if (position == 3) {
            return new ContactFragment();
        } else {
            return new ProfileFragment();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }
}
