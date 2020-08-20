package com.dinosoftlabs.binder.Registration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.icu.text.SimpleDateFormat;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.dinosoftlabs.binder.AppUtils.AlertMessage;
import com.dinosoftlabs.binder.AppUtils.AppData;
import com.dinosoftlabs.binder.AppUtils.GpsTracker;
import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.R;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class BasicIntroductionActivity extends AppCompatActivity implements RecyclerClickInterface{

    EditText etfullname,etemail,etabout;
    TextView etgender,tvbirthdate,tvlocation;
    PopupWindow popupWindow;
    List<String> itemlist;
    RecyclerView rvlist;
    PopupListAdapter adapter;
    TextView tvtitle;
    MySharePreferences sharePreferences;
    private RecyclerClickInterface recyclerClickInterface;
    String[] gender;
    String value;
    GpsTracker gpsTracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_introduction);

        sharePreferences= new MySharePreferences(BasicIntroductionActivity.this);
        recyclerClickInterface= BasicIntroductionActivity.this;
        etfullname=(EditText)findViewById(R.id.etfullname);
        etabout=(EditText)findViewById(R.id.etfullname);
        etemail=(EditText)findViewById(R.id.etfullname);
        etgender=(TextView)findViewById(R.id.etgender);
        tvbirthdate=(TextView)findViewById(R.id.tvbirthdate);
        tvlocation=(TextView)findViewById(R.id.tvlocation);
        gender= getResources().getStringArray(R.array.gender);

        tvlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED ) {
                        ActivityCompat.requestPermissions(BasicIntroductionActivity.this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 101);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
                if (getLocation()){
                    Geocoder geocoder = new Geocoder(BasicIntroductionActivity.this, Locale.getDefault());
                    List<Address> addresses = null;
                    try {
                        addresses = geocoder.getFromLocation(Double.parseDouble(AppData.lat), Double.parseDouble(AppData.lng), 1);

                        String cityName = addresses.get(0).getAddressLine(0);
                        String stateName = addresses.get(0).getAddressLine(1);
                        String countryName = addresses.get(0).getAddressLine(2);
                        AppData.currentLocation= cityName+","+stateName;
                        AppData.currentCountry= countryName;
                        tvlocation.setText(cityName);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }else {
                    AlertMessage.Alertmessage(BasicIntroductionActivity.this,"Please allow to access your current location to find restaurant nearby you");
                    try {
                        if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED ) {
                            ActivityCompat.requestPermissions(BasicIntroductionActivity.this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 101);
                        }
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        tvbirthdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentDate=Calendar.getInstance();
                int mYear=mcurrentDate.get(Calendar.YEAR);
                int mMonth=mcurrentDate.get(Calendar.MONTH);
                int mDay=mcurrentDate.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog mDatePicker=new DatePickerDialog(BasicIntroductionActivity.this, new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {
                        tvbirthdate.setText(selectedday+"/"+selectedmonth+"/"+selectedyear);
                    }
                },mYear, mMonth, mDay);
                mDatePicker.setTitle("Select date");
                mDatePicker.show();
            }
        });

        etgender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                itemlist= new ArrayList<String>();
                itemlist.add("Male");
                itemlist.add("Female");
                itemlist.add("Other");

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                tvtitle=container.findViewById(R.id.tvtitle);
                rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Gender");

                LinearLayoutManager layout= new LinearLayoutManager(BasicIntroductionActivity.this);
                rvlist.setLayoutManager(layout);
                adapter= new PopupListAdapter(BasicIntroductionActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                etgender.setText(sharePreferences.getGender());
                popupWindow.showAsDropDown(etgender);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });

            }
        });

    }

    public void GetBasicIntro(View view) {

        AppData.fullname= etfullname.getText().toString();
        AppData.about= etabout.getText().toString();
        AppData.email= etemail.getText().toString();
        AppData.dob=etemail.getText().toString();
        Intent it= new Intent(BasicIntroductionActivity.this, IntroductionOneActivity.class);
        startActivity(it);
    }

    @Override
    public void recyclerviewOnClick(String position) {
        etgender.setText(position);
        AppData.gender=position;
        popupWindow.dismiss();

    }

    public boolean getLocation(){
        gpsTracker = new GpsTracker(BasicIntroductionActivity.this);
        if(gpsTracker.canGetLocation()){
            double latitude = gpsTracker.getLatitude();
            double longitude = gpsTracker.getLongitude();
            AppData.lat= String.valueOf(latitude);
            AppData.lng= String.valueOf(longitude);
            return true;
        }else{
            gpsTracker.showSettingsAlert();
            return false;
        }
    }
}
