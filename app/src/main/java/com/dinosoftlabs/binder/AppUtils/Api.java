package com.dinosoftlabs.binder.AppUtils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    private static Retrofit retrofit= null;

    public static ApiInterface getClient(){
        if (retrofit== null){
            retrofit= new Retrofit.Builder()
                    .baseUrl("http://neosao.com/testing/dating/Api/Api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        ApiInterface api= retrofit.create(ApiInterface.class);
        return api;
    }

}

