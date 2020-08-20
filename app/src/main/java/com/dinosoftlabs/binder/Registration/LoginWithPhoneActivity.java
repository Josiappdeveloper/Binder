package com.dinosoftlabs.binder.Registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.dinosoftlabs.binder.R;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class LoginWithPhoneActivity extends AppCompatActivity {

    EditText etphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_phone);
        etphone=(EditText)findViewById(R.id.etphone);

    }

    public void GetOtp(View view) {
        String mobile = etphone.getText().toString().trim();
        if(mobile.isEmpty() || mobile.length() < 10){
            etphone.setError("Enter a valid mobile");
            etphone.requestFocus();
            return;
        }else {
            Intent it= new Intent(LoginWithPhoneActivity.this, GetOtpActivity.class);
            it.putExtra("phone", etphone.getText().toString());
            startActivity(it);
        }

    }
}
