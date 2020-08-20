package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class IndustryModel implements Serializable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private IndustryResult industryResult;
    private final static long serialVersionUID = -1291833962531991676L;

    /**
     * No args constructor for use in serialization
     *
     */
    public IndustryModel() {
    }

    /**
     *
     * @param industryResult
     * @param status
     */
    public IndustryModel(String status, IndustryResult industryResult) {
        super();
        this.status = status;
        this.industryResult = industryResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IndustryResult getIndustryResult() {
        return industryResult;
    }

    public void setIndustryResult(IndustryResult industryResult) {
        this.industryResult = industryResult;
    }
}
