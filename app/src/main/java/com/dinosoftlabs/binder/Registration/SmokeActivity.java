package com.dinosoftlabs.binder.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dinosoftlabs.binder.R;

public class SmokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoke);
    }

    public void GetSmoke(View view) {
        Intent it= new Intent(SmokeActivity.this, DrinkActivity.class);
        startActivity(it);
    }
}
