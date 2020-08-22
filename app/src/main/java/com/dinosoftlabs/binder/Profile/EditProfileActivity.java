package com.dinosoftlabs.binder.Profile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.R;

import java.io.IOException;

public class EditProfileActivity extends AppCompatActivity {

    MySharePreferences sharePreferences;
    ImageView imgprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

       /* sharePreferences= new MySharePreferences(EditProfileActivity.this);
        imgprofile=(ImageView)findViewById(R.id.imgprofile);
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), Uri.parse(sharePreferences.getImg_one()));
            imgprofile.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void BackButton(View view) {
        finish();
    }*/
    }
}
