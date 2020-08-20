package com.dinosoftlabs.binder.Registration;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.Main_Menu.MainMenuActivity;
import com.dinosoftlabs.binder.R;
import com.theartofdev.edmodo.cropper.CropImage;

import java.io.IOException;

public class PhotoActivity extends AppCompatActivity {

    MySharePreferences sharePreferences;
    ImageView img_one,img_two, img_three, img_four,img_five,img_six;
    private final int IMAGE_REQUEST = 1;
    Uri uri;
    Bitmap bitmap;
    String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        sharePreferences= new MySharePreferences(PhotoActivity.this);
        img_one=(ImageView)findViewById(R.id.img_one);
        img_two=(ImageView)findViewById(R.id.img_two);
        img_three=(ImageView)findViewById(R.id.img_three);
        img_four=(ImageView)findViewById(R.id.img_four);
        img_five=(ImageView)findViewById(R.id.img_five);
        img_six=(ImageView)findViewById(R.id.img_six);


        img_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="1";
                CropImage.activity().start(PhotoActivity.this);
            }
        });

        img_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="2";
                CropImage.activity().start(PhotoActivity.this);
            }
        });
        img_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="3";
                CropImage.activity().start(PhotoActivity.this);
            }
        });

        img_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="4";
                CropImage.activity().start(PhotoActivity.this);
            }
        });

        img_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="5";
                CropImage.activity().start(PhotoActivity.this);
            }
        });
        img_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="6";
                CropImage.activity().start(PhotoActivity.this);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {

            CropImage.ActivityResult result = CropImage.getActivityResult(data);

            if (resultCode == RESULT_OK) {

                uri = result.getUri();

                try {
                    bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (flag.equals("1")){
                    img_one.setImageBitmap(bitmap);
                    sharePreferences.setImg_one(uri.toString());
                }else if (flag.equals("2")){
                    img_two.setImageBitmap(bitmap);
                    sharePreferences.setImg_two(uri.toString());
                }else if (flag.equals("3")){
                    img_three.setImageBitmap(bitmap);
                    sharePreferences.setImg_three(uri.toString());
                }else if (flag.equals("4")){
                    img_four.setImageBitmap(bitmap);
                    sharePreferences.setImg_four(uri.toString());
                }else if (flag.equals("5")){
                    img_five.setImageBitmap(bitmap);
                    sharePreferences.setImg_four(uri.toString());
                }else if (flag.equals("6")){
                    img_six.setImageBitmap(bitmap);
                    sharePreferences.setImg_four(uri.toString());
                }

            }
        }

        if (requestCode == IMAGE_REQUEST && resultCode == RESULT_OK) {

            Uri path = data.getData();

            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), path);

                // Plus_Button.setImageBitmap(bitmap);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void GetRegister(View view) {

        Intent it= new Intent(PhotoActivity.this, MainMenuActivity.class);
        startActivity(it);
    }
}
