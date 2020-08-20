package com.dinosoftlabs.binder.Registration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.dinosoftlabs.binder.AppUtils.AppData;
import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.Main_Menu.MainMenuActivity;
import com.dinosoftlabs.binder.R;

import java.util.ArrayList;
import java.util.List;

public class IntroductionFourActivity extends AppCompatActivity implements RecyclerClickInterface {

    MySharePreferences sharePreferences;
    RecyclerClickInterface recyclerClickInterface;
    PopupWindow popupWindow;
    List<String> itemlist;
    String flag;
    TextView tvhavekids, tvwantkids, tvlookingfor, tvbodytype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_four);
        sharePreferences= new MySharePreferences(IntroductionFourActivity.this);
        recyclerClickInterface=IntroductionFourActivity.this;
        tvhavekids=(TextView)findViewById(R.id.tvhavekids);
        tvwantkids=(TextView)findViewById(R.id.tvwantkids);
        tvlookingfor=(TextView)findViewById(R.id.tvlookingfor);
        tvbodytype=(TextView)findViewById(R.id.tvbodytype);

        tvhavekids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="1";
                itemlist= new ArrayList<>();
                itemlist.add("Yes");
                itemlist.add("No");
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Do you Have Kids?");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionFourActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionFourActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvhavekids);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvwantkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="2";
                itemlist= new ArrayList<>();
                itemlist.add("Yes");
                itemlist.add("No");
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Do you want Kids?");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionFourActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionFourActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvhavekids);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvlookingfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="3";
                itemlist= new ArrayList<>();
                itemlist.add("");
                itemlist.add("");
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("You are looking");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionFourActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionFourActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvhavekids);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvbodytype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="4";
                itemlist= new ArrayList<>();
                itemlist.add("");
                itemlist.add("");
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Body Type");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionFourActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionFourActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvhavekids);
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

    public void GetIntrotfour(View view) {
        AppData.havekids= tvhavekids.getText().toString();
        AppData.wantkids= tvwantkids.getText().toString();
        AppData.lookingfor=  tvlookingfor.getText().toString();
        AppData.bodytype= tvbodytype.getText().toString();
        AppData.registerType="mobile";
        AppData.firebaseId="";
        AppData.currentLocation="";
        AppData.currentCountry="";
        GetRegistrationDetails();
        Intent it= new Intent(IntroductionFourActivity.this, PhotoActivity.class);
        startActivity(it);
    }

    private void GetRegistrationDetails() {
    }

    @Override
    public void recyclerviewOnClick(String position) {
        if (flag.equals("1")){
            tvhavekids.setText(position);
        }else  if (flag.equals("2")){
            tvwantkids.setText(position);
        }else  if (flag.equals("3")){
            tvlookingfor.setText(position);
        }else if (flag.equals("4")){
            tvbodytype.setText(position);
        }
        popupWindow.dismiss();
    }
}
