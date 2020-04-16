package com.example.besafe;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.infoFragment;
import com.profileFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(navlistner);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                    new HomeFragment()).commit();
        }

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedfragment = null;

            switch (item.getItemId()) {
                case R.id.nav_home:
                    selectedfragment = new HomeFragment();
                    break;
                case R.id.nav_info:
                    selectedfragment = new infoFragment();
                    break;
                case R.id.nav_profile:
                    selectedfragment = new profileFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,
                    selectedfragment).commit();
            return true;


        }

    } ;
    }



