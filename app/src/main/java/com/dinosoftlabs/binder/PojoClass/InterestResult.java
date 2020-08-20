package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class InterestResult implements Serializable {
    @SerializedName("interestList")
    @Expose
    private List<InterestList> interestList = null;
    private final static long serialVersionUID = -6175128004306569219L;

    /**
     * No args constructor for use in serialization
     *
     */
    public InterestResult() {
    }

    /**
     *
     * @param interestList
     */
    public InterestResult(List<InterestList> interestList) {
        super();
        this.interestList = interestList;
    }

    public List<InterestList> getInterestList() {
        return interestList;
    }

    public void setInterestList(List<InterestList> interestList) {
        this.interestList = interestList;
    }

}
