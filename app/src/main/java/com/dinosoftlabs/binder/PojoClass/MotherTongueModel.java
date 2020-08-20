package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MotherTongueModel implements Serializable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private MotherTongueResult motherTongueResult;
    private final static long serialVersionUID = 6229625123459600217L;

    /**
     * No args constructor for use in serialization
     *
     */
    public MotherTongueModel() {
    }

    /**
     *
     * @param motherTongueResult
     * @param status
     */
    public MotherTongueModel(String status, MotherTongueResult motherTongueResult) {
        super();
        this.status = status;
        this.motherTongueResult = motherTongueResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MotherTongueResult getMotherTongueResult() {
        return motherTongueResult;
    }

    public void setMotherTongueResult(MotherTongueResult motherTongueResult) {
        this.motherTongueResult = motherTongueResult;
    }
}
