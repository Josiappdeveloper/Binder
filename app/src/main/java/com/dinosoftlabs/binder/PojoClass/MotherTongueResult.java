package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MotherTongueResult implements Serializable {
    @SerializedName("mothertoungeList")
    @Expose
    private List<MothertoungeList> mothertoungeList = null;
    private final static long serialVersionUID = 6079410039405947327L;

    /**
     * No args constructor for use in serialization
     *
     */
    public MotherTongueResult() {
    }

    /**
     *
     * @param mothertoungeList
     */
    public MotherTongueResult(List<MothertoungeList> mothertoungeList) {
        super();
        this.mothertoungeList = mothertoungeList;
    }

    public List<MothertoungeList> getMothertoungeList() {
        return mothertoungeList;
    }

    public void setMothertoungeList(List<MothertoungeList> mothertoungeList) {
        this.mothertoungeList = mothertoungeList;
    }

}
