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
import com.dinosoftlabs.binder.PojoClass.CasteModel;
import com.dinosoftlabs.binder.PojoClass.ReligionModel;
import com.dinosoftlabs.binder.R;

import java.util.ArrayList;
import java.util.List;

public class IntroductionTwoActivity extends AppCompatActivity implements RecyclerClickInterface {

    TextView tvheight,tvzodicsign,tvstatus,tvreligion,tvcasts,tvsextualori,tvshowme;
    PopupWindow popupWindow;
    MySharePreferences sharePreferences;
    List<String> itemlist;
    List<String> ReligionList;
    List<String> CasteList;
    String flag;
    RecyclerClickInterface recyclerClickInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_two);

        recyclerClickInterface=IntroductionTwoActivity.this;
        tvheight=(TextView)findViewById(R.id.tvheight);
        tvzodicsign=(TextView)findViewById(R.id.tvzodicsign);
        tvstatus=(TextView)findViewById(R.id.tvstatus);
        tvreligion=(TextView)findViewById(R.id.tvreligion);
        tvcasts=(TextView)findViewById(R.id.tvcasts);
        tvsextualori=(TextView)findViewById(R.id.tvsextualori);
        tvsextualori.setVisibility(View.GONE);
        tvshowme=(TextView)findViewById(R.id.tvshowme);
        ReligionList= new ArrayList<>();
        CasteList= new ArrayList<>();
        GetCasteList();
        GetReligionList();
        tvshowme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="7";
                itemlist= new ArrayList<>();
                itemlist.add("Male");
                itemlist.add("Female");

                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Show Me");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionTwoActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionTwoActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvheight);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="5";
                itemlist= new ArrayList<>();
                itemlist.add("Hindu");
                itemlist.add("Muslim");
                itemlist.add("Sindhi");
                itemlist.add("Chritian");
                itemlist.add("Parsi");
                itemlist.add("Sikh");
                itemlist.add("Jain");
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Casts");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionTwoActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionTwoActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvheight);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvreligion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag="4";
                itemlist= new ArrayList<>();
                itemlist.add("Hindu");
                itemlist.add("Muslim");
                itemlist.add("Sindhi");
                itemlist.add("Chritian");
                itemlist.add("Parsi");
                itemlist.add("Sikh");
                itemlist.add("Jain");
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Religions");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionTwoActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionTwoActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvheight);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="3";
                itemlist= new ArrayList<>();
                itemlist.add("Single");
                itemlist.add("Single with kids");
                itemlist.add("Divorced");
                itemlist.add("Divorced with Kids");
                itemlist.add("Married");
                itemlist.add("Unmarried");

                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Status");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionTwoActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionTwoActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvheight);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvzodicsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="1";
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                itemlist= new ArrayList<String>();
                itemlist.add("Aries");
                itemlist.add("Taurus");
                itemlist.add("Gemini");
                itemlist.add("Cancer");
                itemlist.add("Leo");
                itemlist.add("Virgo");
                itemlist.add("Libra");
                itemlist.add("Scorpio");
                itemlist.add("Sagittarius");
                itemlist.add("Capricorn");
                itemlist.add("Aquarius");
                itemlist.add("Pisces");

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Zodiac Signs");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionTwoActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionTwoActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvheight);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvheight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag="2";
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                itemlist= new ArrayList<String>();
                itemlist.add("4'8''");
                itemlist.add("4'9''");
                itemlist.add("5'10''");
                itemlist.add("5'11''");
                itemlist.add("6'1''");
                itemlist.add("6'2''");
                itemlist.add("6'3''");
                itemlist.add("6'4''");
                itemlist.add("6'5''");
                itemlist.add("6'6''");
                itemlist.add("6'7''");
                itemlist.add("6'8''");
                itemlist.add("6'9''");
                itemlist.add("6'10''");
                itemlist.add("6'11''");
                itemlist.add("7'2''");
                itemlist.add("7'3''");

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Height");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionTwoActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionTwoActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvheight);
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

    private void GetReligionList() {
        ProgressDialog progressDialog= new ProgressDialog(IntroductionTwoActivity.this);
        progressDialog.setMessage(getString(R.string.progressmsg));
        progressDialog.setCancelable(false);
        progressDialog.show();

        (Api.getClient().GetReligionList()).enqueue(new Callback<ReligionModel>() {
            @Override
            public void onResponse(Call<ReligionModel> call, Response<ReligionModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()){
                    if (response.body()!=null){
                        for (int i=0;i<response.body().getReligionResult().getReligionList().size();i++){
                            String name= response.body().getReligionResult().getReligionList().get(i).getReligionName();
                            ReligionList.add(name);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<ReligionModel> call, Throwable t) {
                progressDialog.dismiss();
            }
        });
    }

    private void GetCasteList() {
        ProgressDialog progressDialog= new ProgressDialog(IntroductionTwoActivity.this);
        progressDialog.setMessage("Please Wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        (Api.getClient().GetCasteList()).enqueue(new Callback<CasteModel>() {
            @Override
            public void onResponse(Call<CasteModel> call, Response<CasteModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()){
                    if (response.body()!=null){
                        for(int i=0;i<response.body().getCasteResult().getCasteList().size();i++){
                            String name= response.body().getCasteResult().getCasteList().get(i).getCasteName();
                            CasteList.add(name);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<CasteModel> call, Throwable t) {

            }
        });
    }

    public void GetIntrotwo(View view) {
        AppData.zodicsign= tvzodicsign.getText().toString();
        AppData.height= tvheight.getText().toString();
        AppData.status= tvstatus.getText().toString();
        AppData.religion= tvreligion.getText().toString();
        AppData.caste= tvcasts.getText().toString();
        AppData.showme= tvshowme.getText().toString();
        Intent it= new Intent(IntroductionTwoActivity.this, IntroductionThreeActivity.class);
        startActivity(it);
    }

    @Override
    public void recyclerviewOnClick(String position) {
        if (flag.equals("1")){
            tvzodicsign.setText(position);
        }else  if (flag.equals("2")){
            tvheight.setText(position);
        }else  if (flag.equals("3")){
            tvstatus.setText(position);
        }else if (flag.equals("4")){
            tvreligion.setText(position);
        }else if (flag.equals("5")){
            tvcasts.setText(position);
        }else if (flag.equals("7")){
            tvshowme.setText(position);
        }
            popupWindow.dismiss();
    }
}
