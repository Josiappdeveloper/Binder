package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class StudyModel implements Serializable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private StudyResult studyResult;

    /**
     * No args constructor for use in serialization
     *
     */
    public StudyModel() {
    }

    /**
     *
     * @param studyResult
     * @param status
     */
    public StudyModel(String status, StudyResult studyResult) {
        super();
        this.status = status;
        this.studyResult = studyResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StudyResult getStudyResult() {
        return studyResult;
    }

    public void setStudyResult(StudyResult studyResult) {
        this.studyResult = studyResult;
    }

}
