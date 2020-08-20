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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.dinosoftlabs.binder.AppUtils.Api;
import com.dinosoftlabs.binder.AppUtils.AppData;
import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.PojoClass.IndustryModel;
import com.dinosoftlabs.binder.PojoClass.MotherTongueModel;
import com.dinosoftlabs.binder.PojoClass.StudyModel;
import com.dinosoftlabs.binder.R;

import java.util.ArrayList;
import java.util.List;

public class IntroductionOneActivity extends AppCompatActivity implements RecyclerClickInterface {

    MySharePreferences sharePreferences;
    RecyclerClickInterface recyclerClickInterface;
    PopupWindow popupWindow;
    List<String> itemlist;
    List<String> IndustryList;
    List<String> StudyList;
    List<String> LanguageList;

    String flag;
    String Value;
    TextView tvstudy, tvqualification, tvindustry, tvexperience,tvmothertongue;
    EditText etuniversity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_one);
        sharePreferences= new MySharePreferences(IntroductionOneActivity.this);
        recyclerClickInterface= IntroductionOneActivity.this;
        etuniversity=(EditText)findViewById(R.id.etuniversity);
        tvstudy=(TextView)findViewById(R.id.tvstudy);
        tvqualification=(TextView)findViewById(R.id.tvqualification);
        tvindustry=(TextView)findViewById(R.id.tvindustry);
        tvexperience=(TextView)findViewById(R.id.tvexperience);
        tvmothertongue=(TextView)findViewById(R.id.tvmothertongue);

        IndustryList=new ArrayList<>();
        StudyList= new ArrayList<>();
        LanguageList= new ArrayList<>();
        GetIndustryList();
        GetStudyList();
        GetLanguageList();

        tvmothertongue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="5";
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Field of Study");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionOneActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionOneActivity.this,LanguageList, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvstudy);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvstudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag="1";

                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Field of Study");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionOneActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionOneActivity.this,StudyList, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvstudy);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvqualification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="2";
                itemlist= new ArrayList<>();
                itemlist.add("Bachlors");
                itemlist.add("Masters");
                itemlist.add("PHD");
                itemlist.add("Post Doc");

                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Qualification");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionOneActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionOneActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvqualification);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvindustry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag="3";
                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Work Industry");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionOneActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionOneActivity.this,IndustryList, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvindustry);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        popupWindow.dismiss();
                        return false;
                    }
                });
            }
        });
        tvexperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag="4";
                itemlist= new ArrayList<>();
                itemlist.add("1");
                itemlist.add("2");
                itemlist.add("3");
                itemlist.add("4");
                itemlist.add("5");
                itemlist.add("6");
                itemlist.add("7");
                itemlist.add("8");
                itemlist.add("9");
                itemlist.add("10+");


                LayoutInflater layoutInflater = (LayoutInflater) getApplication().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container  = (ViewGroup) layoutInflater.inflate(R.layout.layout_for_popup_window,null);

                int width = LinearLayout.LayoutParams.WRAP_CONTENT;
                int height = LinearLayout.LayoutParams.WRAP_CONTENT;
                boolean focusable = true;
                popupWindow = new PopupWindow(container,width,height,focusable);
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                TextView tvtitle=container.findViewById(R.id.tvtitle);
                RecyclerView rvlist = container.findViewById(R.id.rvlist);
                tvtitle.setText("Exterience");

                LinearLayoutManager layout= new LinearLayoutManager(IntroductionOneActivity.this);
                rvlist.setLayoutManager(layout);
                PopupListAdapter adapter= new PopupListAdapter(IntroductionOneActivity.this,itemlist, recyclerClickInterface);
                rvlist.setAdapter(adapter);
                popupWindow.showAsDropDown(tvexperience);
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

    private void GetLanguageList() {
        ProgressDialog progressDialog= new ProgressDialog(IntroductionOneActivity.this);
        progressDialog.setMessage("Please Wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        (Api.getClient().GetMotherTongueList()).enqueue(new Callback<MotherTongueModel>() {
            @Override
            public void onResponse(Call<MotherTongueModel> call, Response<MotherTongueModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()){
                    if (response.body()!=null){
                        for (int i=0; i<response.body().getMotherTongueResult().getMothertoungeList().size();i++){
                            String name=response.body().getMotherTongueResult().getMothertoungeList().get(i).getMothertoungeName();
                            LanguageList.add(name);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<MotherTongueModel> call, Throwable t) {
                progressDialog.dismiss();
            }
        });
    }

    private void GetStudyList() {
        ProgressDialog progressDialog= new ProgressDialog(IntroductionOneActivity.this);
        progressDialog.setMessage("Please Wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        (Api.getClient().GetStudyList()).enqueue(new Callback<StudyModel>() {
            @Override
            public void onResponse(Call<StudyModel> call, Response<StudyModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()){
                    if (response.body()!=null){
                        for (int i=0;i<response.body().getStudyResult().getFieldofStudyList().size();i++){
                            String name= response.body().getStudyResult().getFieldofStudyList().get(i).getFieldName();
                            StudyList.add(name);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<StudyModel> call, Throwable t) {
                progressDialog.dismiss();
            }
        });
    }

    private void GetIndustryList() {
        ProgressDialog progressDialog= new ProgressDialog(IntroductionOneActivity.this);
        progressDialog.setMessage("Please Wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        (Api.getClient().GetIndustries()).enqueue(new Callback<IndustryModel>() {
            @Override
            public void onResponse(Call<IndustryModel> call, Response<IndustryModel> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()){
                    if (response.body()!=null){
                        for (int i = 0; i< response.body().getIndustryResult().getWorkindustryList().size(); i++){
                            String name= response.body().getIndustryResult().getWorkindustryList().get(i).getIndustryName();
                            IndustryList.add(name);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<IndustryModel> call, Throwable t) {

            }
        });
    }

    public void GetIntrotone(View view) {
        AppData.fieldofstudy= tvstudy.getText().toString();
        AppData.qualification= tvqualification.getText().toString();
        AppData.industry=tvindustry.getText().toString();
        AppData.experience= tvexperience.getText().toString();
        AppData.motherTounge= tvmothertongue.getText().toString();

        Intent it= new Intent(IntroductionOneActivity.this, IntroductionTwoActivity.class);
        startActivity(it);
    }

    @Override
    public void recyclerviewOnClick(String position) {
        if (flag.equals("1")){
            tvstudy.setText(position);
        }else if (flag.equals("2")){
            tvqualification.setText(position);
        }else if (flag.equals("3")){
            tvindustry.setText(position);
        }else if (flag.equals("4")){
            tvexperience.setText(position);
        }else if (flag.equals("5")){
            tvmothertongue.setText(position);
        }
        popupWindow.dismiss();
    }
}
