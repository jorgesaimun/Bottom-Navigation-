package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnView = findViewById(R.id.bnView);

//        @SuppressLint("ResourceType") Menu mn = findViewById(R.menu.nav_item);
//
//        viewPagerManagerAdapter adapter = new viewPagerManagerAdapter(getSupportFragmentManager());
//
//        mn.setAdapter(adapter);


        loadFrag(new HomeFragment(), 0);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int Id = item.getItemId();
                if (Id == R.id.nav_Home) {
                    loadFrag(new HomeFragment(), 1);

                } else if (Id == R.id.nav_Profile) {
                    loadFrag(new ProfileFragment(), 1);
                } else if (Id == R.id.nav_Contact) {
                    loadFrag(new ContactFragment(), 1);

                } else if (Id == R.id.nav_Search) {

                    loadFrag(new SearchFragment(), 1);

                } else if (Id == R.id.nav_Settings) {
                    loadFrag(new SettingFragment(), 1);
                }
                return true;
            }
        });

    }

    public void loadFrag(Fragment fragment, int flag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag == 0) {
            ft.add(R.id.container, fragment);
        } else {
            ft.replace(R.id.container, fragment);
        }

        ft.commit();
    }
}