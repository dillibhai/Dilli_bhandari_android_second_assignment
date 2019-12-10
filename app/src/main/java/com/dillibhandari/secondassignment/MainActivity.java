package com.dillibhandari.secondassignment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.dillibhandari.secondassignment.fragements.AreaofCircleFragment;
import com.dillibhandari.secondassignment.fragements.AutomorphicFragment;
import com.dillibhandari.secondassignment.fragements.PalindromeFragment;
import com.dillibhandari.secondassignment.fragements.SwapnoFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private TextView tv_textnames;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_textnames = findViewById(R.id.tv_textnames);
        dl = findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        t.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(t);
        t.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                int id = item.getItemId();
                dl.closeDrawer(GravityCompat.START);
                switch(id)
                {
                    case R.id.areofCircle: {
                        tv_textnames.setText("Area of Circle");
                        AreaofCircleFragment areaofCircleFragment = new AreaofCircleFragment();
                        fragmentTransaction.replace(R.id.fragementContainer, areaofCircleFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        break;
                    }
                    case R.id.palindrome:{
                        tv_textnames.setText("Check if Palindrome");
                        PalindromeFragment palindromeFragment = new PalindromeFragment();
                        fragmentTransaction.replace(R.id.fragementContainer, palindromeFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        break;
                    }

                    case R.id.swapno:{
                        tv_textnames.setText("Swap two Numbers");
                        SwapnoFragment swapnoFragment = new SwapnoFragment();
                        fragmentTransaction.replace(R.id.fragementContainer, swapnoFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        break;
                    }
                    case R.id.automorphic: {
                        tv_textnames.setText("Check if Automorphic");
                        AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                        fragmentTransaction.replace(R.id.fragementContainer, automorphicFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        break;
                    }
                    default:
                        return true;
                }


                return true;

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

}
