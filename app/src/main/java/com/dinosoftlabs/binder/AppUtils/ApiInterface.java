package com.dinosoftlabs.binder.AppUtils;

import com.dinosoftlabs.binder.PojoClass.CasteModel;
import com.dinosoftlabs.binder.PojoClass.IndustryModel;
import com.dinosoftlabs.binder.PojoClass.InterestModel;
import com.dinosoftlabs.binder.PojoClass.MotherTongueModel;
import com.dinosoftlabs.binder.PojoClass.RegisterPhoneModel;
import com.dinosoftlabs.binder.PojoClass.ReligionList;
import com.dinosoftlabs.binder.PojoClass.ReligionModel;
import com.dinosoftlabs.binder.PojoClass.StudyModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("industryList")
    Call<IndustryModel> GetIndustries();

    @GET("mothertoungeList")
    Call<MotherTongueModel> GetMotherTongueList();

    @GET("casteList")
    Call<CasteModel> GetCasteList();

    @GET("religionList")
    Call<ReligionModel> GetReligionList();

    @GET("fieldofStudyList")
    Call<StudyModel> GetStudyList();

    @GET("interestList")
    Call<InterestModel> GetInterrestList();

    @POST("registration?")
    Call<RegisterPhoneModel> GetRegistrationDetails(@Query("registerType") String registerType,
                                                    @Query("firebaseId") String firebaseId,
                                                    @Query("name") String name,
                                                    @Query("zodiacSign") String zodiacSign,
                                                    @Query("contactNumber") String contactNumber,
                                                    @Query("gender") String gender,
                                                    @Query("birthDate") String birthDate,
                                                    @Query("currentLocation") String currentLocation,
                                                    @Query("currentCountry") String currentCountry,
                                                    @Query("height") String height,
                                                    @Query("motherTounge") String motherTounge,
                                                    @Query("maritalStatus") String maritalStatus,
                                                    @Query("caste") String caste,
                                                    @Query("religion") String religion,
                                                    @Query("drink") String drink,
                                                    @Query("smoke") String smoke,
                                                    @Query("fieldStudyCode") String fieldStudyCode,
                                                    @Query("highestQualification") String highestQualification,
                                                    @Query("industryCode") String industryCode,
                                                    @Query("experienceYears") String experienceYears,
                                                    @Query("email") String email);
}
