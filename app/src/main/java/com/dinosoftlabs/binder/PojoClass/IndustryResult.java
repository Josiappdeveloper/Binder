package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class IndustryResult implements Serializable {
    @SerializedName("workindustryList")
    @Expose
    private List<WorkindustryList> workindustryList = null;
    private final static long serialVersionUID = 753171250734711388L;

    /**
     * No args constructor for use in serialization
     *
     */
    public IndustryResult() {
    }

    /**
     *
     * @param workindustryList
     */
    public IndustryResult(List<WorkindustryList> workindustryList) {
        super();
        this.workindustryList = workindustryList;
    }

    public List<WorkindustryList> getWorkindustryList() {
        return workindustryList;
    }

    public void setWorkindustryList(List<WorkindustryList> workindustryList) {
        this.workindustryList = workindustryList;
    }
}
