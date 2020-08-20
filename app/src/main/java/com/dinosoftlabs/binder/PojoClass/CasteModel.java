package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CasteModel implements Serializable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private CasteResult casteResult;

    /**
     * No args constructor for use in serialization
     *
     */
    public CasteModel() {
    }

    /**
     *
     * @param casteResult
     * @param status
     */
    public CasteModel(String status, CasteResult casteResult) {
        super();
        this.status = status;
        this.casteResult = casteResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CasteResult getCasteResult() {
        return casteResult;
    }

    public void setCasteResult(CasteResult casteResult) {
        this.casteResult = casteResult;
    }

}
