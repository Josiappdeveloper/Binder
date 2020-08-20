package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ReligionResult implements Serializable {
    @SerializedName("religionList")
    @Expose
    private List<ReligionList> religionList = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ReligionResult() {
    }

    /**
     *
     * @param religionList
     */
    public ReligionResult(List<ReligionList> religionList) {
        super();
        this.religionList = religionList;
    }

    public List<ReligionList> getReligionList() {
        return religionList;
    }

    public void setReligionList(List<ReligionList> religionList) {
        this.religionList = religionList;
    }
}
