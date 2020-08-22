package com.dinosoftlabs.binder.utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.dinosoftlabs.binder.Main_Menu.MainMenuActivity;
import com.dinosoftlabs.binder.Matchs.Match_F;
import com.dinosoftlabs.binder.Profile.ProfileActivity;
import com.dinosoftlabs.binder.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;


/**
 * DatingApp
 * https://github.com/quintuslabs/DatingApp
 * Created on 25-sept-2018.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */

public class TopNavigationViewHelper {

    private static final String TAG = "TopNavigationViewHelper";

    public static void setupTopNavigationView(BottomNavigationViewEx tv) {
        Log.d(TAG, "setupTopNavigationView: setting up navigationview");


    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_profile:
                        Intent intent2 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_main:
                        Intent intent1 = new Intent(context, MainMenuActivity.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_matched:
                        Intent intent3 = new Intent(context, Match_F.class);
                        context.startActivity(intent3);

                        break;
                }

                return false;
            }
        });
    }
}
