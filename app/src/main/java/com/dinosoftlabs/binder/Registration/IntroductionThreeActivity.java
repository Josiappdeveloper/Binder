package com.dinosoftlabs.binder.Registration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.ProgressDialog;
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

import com.dinosoftlabs.binder.AppUtils.Api;
import com.dinosoftlabs.binder.AppUtils.AppData;
import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.PojoClass.InterestModel;
import com.dinosoftlabs.binder.R;

import java.util.ArrayList;
import java.util.List;

public class IntroductionThreeActivity extends AppCompatActivity implements RecyclerClickInterface {

    MySharePreferences sharePreferences;
    List<String> itemlist;
    List<String> InterrestList;
    String flag;
    PopupWindow popupWindow;
    RecyclerClickInterface recyclerClickInterface;
    TextView tvdrink,tvsmoke,tvdiet,tvpet, tvinterest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_three);
        sharePreferences= new MySharePreferences(IntroductionThreeActivity.this);
        recyclerClickInterface=IntroductionThreeActivity.this;
        tvdrink=(TextView)findViewById(R.id.tvdrink);
        tvsmoke=(TextView)findViewById(R.id.tvsmoke);
        tvdiet=(TextView)findViewById(R.id.tvdiet);
        tvpet=(TextView)findViewById(R.id.tvpets);
        tvinterest=(TextView)findViewById(R.id.tvinterests);
        InterrestList= new ArrayList<>();
        GetInterestList();
        tvdrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="1";
                itemlist= new ArrayList<>();
                itemlist.add("Teetotaler");
                itemlist.add("Occassionaly");
                itemlist.add("Socialy");
                itemlist.add("Regular");
                itemlist.add("Planing to Quit");

                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Drinking Habit");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionThreeActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionThreeActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvdrink);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvsmoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="2";
                itemlist= new ArrayList<>();
                itemlist.add("Yes");
                itemlist.add("No");
                itemlist.add("Planning to Quit");

                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Smoking Habit");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionThreeActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionThreeActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvsmoke);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvdiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="3";
                itemlist= new ArrayList<>();
                itemlist.add("Vegitarian");
                itemlist.add("Non Vegitarian");

                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Diet");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionThreeActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionThreeActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvdiet);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="4";
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
                tvtitle.setText("Do you like pet?");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionThreeActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionThreeActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvpet);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="5";
                itemlist= new ArrayList<>();
                itemlist.add("Cooking");
                itemlist.add("Travel");
                itemlist.add("Gardining");
                itemlist.add("Music");
                itemlist.add("Singing");
                itemlist.add("Dancing");
                itemlist.add("Gaming");
                itemlist.add("Books");
                itemlist.add("Fitness");
                itemlist.add("Shopping");
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("You like to do..");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionThreeActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionThreeActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvinterest);
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

    private void GetInterestList() {
        ProgressDialog progressDialog= new ProgressDialog(IntroductionThreeActivity.this);
        progressDialog.setMessage("Please Wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        (Api.getClient().GetInterrestList()).enqueue(new Callback<InterestModel>() {
            @Override
            public void onResponse(Call<InterestModel> call, Response<InterestModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()){
                    if (response.body()!=null){
                        for (int i=0;i<response.body().getInterestResult().getInterestList().size();i++){
                            String name= response.body().getInterestResult().getInterestList().get(i).getInterestName();
                            InterrestList.add(name);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<InterestModel> call, Throwable t) {

            }
        });
    }

    public void GetIntrothree(View view) {
        AppData.drink= tvdrink.getText().toString();
        AppData.smoke= tvsmoke.getText().toString();
        AppData.diet= tvdiet.getText().toString();
        AppData.pets= tvpet.getText().toString();
        AppData.interest= tvinterest.getText().toString();
        Intent it= new Intent(IntroductionThreeActivity.this, IntroductionFourActivity.class);
        startActivity(it);
    }

    @Override
    public void recyclerviewOnClick(String position) {

        if (flag.equals("1")){
            tvdrink.setText(position);
        }else  if (flag.equals("2")){
            tvsmoke.setText(position);
        }else  if (flag.equals("3")){
            tvdiet.setText(position);
        }else if (flag.equals("4")){
            tvpet.setText(position);
        }else if (flag.equals("5")){
            tvinterest.setText(position);
        }
        popupWindow.dismiss();
    }
}
