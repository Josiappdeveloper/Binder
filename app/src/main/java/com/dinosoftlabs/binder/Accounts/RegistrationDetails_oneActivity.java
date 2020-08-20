package com.dinosoftlabs.binder.Accounts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dinosoftlabs.binder.R;

public class RegistrationDetails_oneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_details_one);
    }

    public void BackButton(View view) {
        finish();
    }

    public void Registration_Details_1(View view) {
    }
}
