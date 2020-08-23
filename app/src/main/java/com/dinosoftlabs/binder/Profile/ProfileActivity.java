package com.dinosoftlabs.binder.Profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.R;
import com.dinosoftlabs.binder.Settings.SettingActivity;
import com.dinosoftlabs.binder.Settings.Setting_F;
import com.dinosoftlabs.binder.utils.PulsatorLayout;
import com.dinosoftlabs.binder.utils.TopNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.io.IOException;

public class ProfileActivity extends AppCompatActivity {

    private static final String TAG = "Profile_Activity";
    private static final int ACTIVITY_NUM = 0;
    static boolean active = false;

    private Context mContext = ProfileActivity.this;
    private ImageView Edirpro, Settings;
    private TextView name;

    private String userId;

    /*MySharePreferences sharePreferences;
    TextView tvname,tvcompleteprofile, tvverify, tvinsta, tvpreference, tvyourlikes, tvrecent, tvlovestories,tvhelp;
    ImageView img_one;
    Button btnupgrade;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Edirpro = findViewById(R.id.EditPro);
        Settings = findViewById(R.id.SettingImage);
/*

        PulsatorLayout mPulsator = findViewById(R.id.pulsator);
        mPulsator.start();
*/

        Edirpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ed = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(ed);
            }
        });

        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sett = new Intent(ProfileActivity.this, SettingActivity.class);
                startActivity(sett);
            }
        });

        //setupTopNavigationView();
/*
        imagePerson = findViewById(R.id.circle_profile_image);
        name = findViewById(R.id.profile_name);*/

/*

        ImageButton edit_btn = findViewById(R.id.edit_profile);
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        ImageButton settings = findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, Setting_F.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: resume to the page");

    }


    private void setupTopNavigationView() {
        Log.d(TAG, "setupTopNavigationView: setting up TopNavigationView");
        BottomNavigationViewEx tvEx = findViewById(R.id.topNavViewBar);
        TopNavigationViewHelper.setupTopNavigationView(tvEx);
        TopNavigationViewHelper.enableNavigation(mContext, tvEx);
        Menu menu = tvEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

        */
/*sharePreferences= new MySharePreferences(ProfileActivity.this);
        tvname=(TextView)findViewById(R.id.tvname);
        tvcompleteprofile=(TextView)findViewById(R.id.tvcomplete);
        tvverify=(TextView)findViewById(R.id.tvverify);
        tvinsta=(TextView)findViewById(R.id.tvinsta);
        tvpreference=(TextView)findViewById(R.id.tvpreference);
        tvyourlikes=(TextView)findViewById(R.id.tvyourlikes);
        tvrecent=(TextView)findViewById(R.id.tvrecent);
        tvlovestories=(TextView)findViewById(R.id.tvlovestories);
        tvhelp=(TextView)findViewById(R.id.tvhelp);
        img_one=(ImageView)findViewById(R.id.img_one);
        btnupgrade=(Button)findViewById(R.id.btnupgrade);

        tvname.setText(sharePreferences.getName());
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.parse(sharePreferences.getImg_one()));
            img_one.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
*//*


         */

    }

   /* public void SettingImage(View view) {
        Intent sett = new Intent(ProfileActivity.this, SettingActivity.class);
        startActivity(sett);
    }*/

}
