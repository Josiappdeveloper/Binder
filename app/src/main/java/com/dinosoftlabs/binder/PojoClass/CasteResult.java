package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class CasteResult implements Serializable {
    @SerializedName("casteList")
    @Expose
    private List<CasteList> casteList = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public CasteResult() {
    }

    /**
     *
     * @param casteList
     */
    public CasteResult(List<CasteList> casteList) {
        super();
        this.casteList = casteList;
    }

    public List<CasteList> getCasteList() {
        return casteList;
    }

    public void setCasteList(List<CasteList> casteList) {
        this.casteList = casteList;
    }

}
