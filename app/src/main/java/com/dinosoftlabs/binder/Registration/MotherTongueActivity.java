package com.dinosoftlabs.binder.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dinosoftlabs.binder.R;

public class MotherTongueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_tongue);
    }

    public void GetMotherTongue(View view) {
        Intent it= new Intent(MotherTongueActivity.this, SmokeActivity.class);
        startActivity(it);
    }
}
