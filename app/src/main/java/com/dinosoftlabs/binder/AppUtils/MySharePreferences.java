package com.dinosoftlabs.binder.AppUtils;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharePreferences {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private String id;
    private  String name;
    private  String email;
    private  String gender;
    private  String about;
    private  String height;
    private  String status;
    private  String religion;
    private  String cast;
    private  String value;
    private String img_one;
    private String img_two;
    private String img_three;
    private String img_four;

    Context context;

    public MySharePreferences(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("Userinfo", Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }

    public MySharePreferences() {

    }

    public String getImg_one() {
        this.img_one= sharedPreferences.getString("img_one","");
        return img_one;
    }

    public void setImg_one(String img_one) {
        this.img_one = img_one;
        editor.putString("img_one",img_one);
        editor.apply();
        editor.commit();
    }

    public String getImg_two() {
        this.img_two= sharedPreferences.getString("img_two","");
        return img_two;
    }

    public void setImg_two(String img_two) {
        this.img_two = img_two;
        editor.putString("img_two",img_two);
        editor.apply();
        editor.commit();
    }

    public String getImg_three() {
        this.img_three= sharedPreferences.getString("img_three","");
        return img_three;
    }

    public void setImg_three(String img_three) {
        this.img_three = img_three;
        editor.putString("img_three",img_three);
        editor.apply();
        editor.commit();
    }

    public String getImg_four() {
        this.img_four= sharedPreferences.getString("img_four","");
        return img_four;
    }

    public void setImg_four(String img_four) {
        this.img_four = img_four;
        editor.putString("img_four",img_four);
        editor.apply();
        editor.commit();

    }

    public String getValue() {
        this.value=sharedPreferences.getString("value","");
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        editor.putString("value",value);
        editor.apply();
        editor.commit();
    }

    public String getName() {
        this.name=sharedPreferences.getString("name","");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        editor.putString("name",name);
        editor.apply();
        editor.commit();
    }

    public String getEmail() {
        this.email= sharedPreferences.getString("email","");
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        editor.putString("email",email);
        editor.apply();
        editor.commit();
    }

    public String getGender() {
        this.gender= sharedPreferences.getString("gender","");
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        editor.putString("gender",gender);
        editor.apply();
        editor.commit();
    }

    public String getAbout() {
        this.about= sharedPreferences.getString("about","");
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
        editor.putString("about",about);
        editor.apply();
        editor.commit();
    }

    public String getHeight() {
        this.height=sharedPreferences.getString("height","");
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
        editor.putString("height",height);
        editor.apply();
        editor.commit();
    }

    public String getStatus() {
        this.status=sharedPreferences.getString("status","");
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        editor.putString("status",status);
        editor.apply();
        editor.commit();
    }

    public String getReligion() {
        this.religion=sharedPreferences.getString("religion","");
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
        editor.putString("religion",religion);
        editor.apply();
        editor.commit();
    }

    public String getCast() {
        this.cast=sharedPreferences.getString("cast","");
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
        editor.putString("cast",cast);
        editor.apply();
        editor.commit();
    }
}
