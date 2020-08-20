package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class InterestModel implements Serializable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private InterestResult interestResult;
    private final static long serialVersionUID = 6850047518805512503L;

    /**
     * No args constructor for use in serialization
     *
     */
    public InterestModel() {
    }

    /**
     *
     * @param interestResult
     * @param status
     */
    public InterestModel(String status, InterestResult interestResult) {
        super();
        this.status = status;
        this.interestResult = interestResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InterestResult getInterestResult() {
        return interestResult;
    }

    public void setInterestResult(InterestResult interestResult) {
        this.interestResult = interestResult;
    }
}
