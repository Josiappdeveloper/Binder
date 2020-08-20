package com.dinosoftlabs.binder.Accounts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.dinosoftlabs.binder.R;

public class OtpVerificationActivity extends AppCompatActivity {

    EditText otp_box_1,otp_box_2,otp_box_3,otp_box_4,otp_box_5,otp_box_6;
    StringBuilder sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        otp_box_1=(EditText)findViewById(R.id.otp_box_1);
        otp_box_2=(EditText)findViewById(R.id.otp_box_2);
        otp_box_3=(EditText)findViewById(R.id.otp_box_3);
        otp_box_4=(EditText)findViewById(R.id.otp_box_4);
        otp_box_5=(EditText)findViewById(R.id.otp_box_5);
        otp_box_6=(EditText)findViewById(R.id.otp_box_6);

        sb=new StringBuilder();

        otp_box_1.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if(sb.length()==0&otp_box_1.length()==1)
                {
                    sb.append(s);
                    otp_box_1.clearFocus();
                    otp_box_2.requestFocus();
                    otp_box_2.setCursorVisible(true);
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                if(sb.length()==1)
                {
                    sb.deleteCharAt(0);
                }
            }
            public void afterTextChanged(Editable s) {
                if(sb.length()==0)
                {
                    otp_box_1.requestFocus();
                }
            }
        });

        otp_box_2.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if(sb.length()==0&otp_box_2.length()==1)
                {
                    sb.append(s);
                    otp_box_2.clearFocus();
                    otp_box_3.requestFocus();
                    otp_box_3.setCursorVisible(true);
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                if(sb.length()==1)
                {
                    sb.deleteCharAt(0);
                }
            }
            public void afterTextChanged(Editable s) {
                if(sb.length()==0)
                {
                    otp_box_2.requestFocus();
                }
            }
        });

        otp_box_3.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if(sb.length()==0&otp_box_3.length()==1)
                {
                    sb.append(s);
                    otp_box_3.clearFocus();
                    otp_box_4.requestFocus();
                    otp_box_4.setCursorVisible(true);
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                if(sb.length()==1)
                {
                    sb.deleteCharAt(0);
                }
            }
            public void afterTextChanged(Editable s) {
                if(sb.length()==0)
                {
                    otp_box_3.requestFocus();
                }
            }
        });

        otp_box_4.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if(sb.length()==0&otp_box_4.length()==1)
                {
                    sb.append(s);
                    otp_box_4.clearFocus();
                    otp_box_5.requestFocus();
                    otp_box_5.setCursorVisible(true);
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                if(sb.length()==1)
                {
                    sb.deleteCharAt(0);
                }
            }
            public void afterTextChanged(Editable s) {
                if(sb.length()==0)
                {
                    otp_box_4.requestFocus();
                }
            }
        });
        otp_box_5.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if(sb.length()==0&otp_box_5.length()==1)
                {
                    sb.append(s);
                    otp_box_5.clearFocus();
                    otp_box_6.requestFocus();
                    otp_box_6.setCursorVisible(true);
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                if(sb.length()==1)
                {
                    sb.deleteCharAt(0);
                }
            }
            public void afterTextChanged(Editable s) {
                if(sb.length()==0)
                {
                    otp_box_5.requestFocus();
                }
            }
        });

    }

    public void VerifyOtp(View view) {
        Intent it= new Intent(OtpVerificationActivity.this, RegistrationDetails_oneActivity.class);
        startActivity(it);
    }

    public void BackButton(View view) {
        finish();
    }
}
