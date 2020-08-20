package com.dinosoftlabs.binder.Accounts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dinosoftlabs.binder.R;

public class ContactNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_numner);
    }

    public void SendContact(View view) {
        Intent it= new Intent(ContactNumberActivity.this, OtpVerificationActivity.class);
        startActivity(it);
    }

    public void BackButton(View view) {
        finish();
    }
}
