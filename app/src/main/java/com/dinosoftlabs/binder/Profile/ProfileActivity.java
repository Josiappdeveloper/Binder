package com.dinosoftlabs.binder.Profile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.R;

import java.io.IOException;

public class ProfileActivity extends AppCompatActivity {

    MySharePreferences sharePreferences;
    TextView tvname,tvcompleteprofile, tvverify, tvinsta, tvpreference, tvyourlikes, tvrecent, tvlovestories,tvhelp;
    ImageView img_one;
    Button btnupgrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        sharePreferences= new MySharePreferences(ProfileActivity.this);
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

    }
}
