package com.dinosoftlabs.binder.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dinosoftlabs.binder.R;

public class FaithActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faith);
    }

    public void GetFaith(View view) {
        Intent it= new Intent(FaithActivity.this, MotherTongueActivity.class);
        startActivity(it);
    }
}
