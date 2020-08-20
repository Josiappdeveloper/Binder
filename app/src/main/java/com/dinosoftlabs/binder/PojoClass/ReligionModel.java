package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ReligionModel implements Serializable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private ReligionResult religionResult;

    /**
     * No args constructor for use in serialization
     *
     */
    public ReligionModel() {
    }

    /**
     *
     * @param religionResult
     * @param status
     */
    public ReligionModel(String status, ReligionResult religionResult) {
        super();
        this.status = status;
        this.religionResult = religionResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReligionResult getReligionResult() {
        return religionResult;
    }

    public void setReligionResult(ReligionResult religionResult) {
        this.religionResult = religionResult;
    }
}
