package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class StudyResult implements Serializable {
    @SerializedName("fieldofStudyList")
    @Expose
    private List<FieldofStudyList> fieldofStudyList = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public StudyResult() {
    }

    /**
     *
     * @param fieldofStudyList
     */
    public StudyResult(List<FieldofStudyList> fieldofStudyList) {
        super();
        this.fieldofStudyList = fieldofStudyList;
    }

    public List<FieldofStudyList> getFieldofStudyList() {
        return fieldofStudyList;
    }

    public void setFieldofStudyList(List<FieldofStudyList> fieldofStudyList) {
        this.fieldofStudyList = fieldofStudyList;
    }

}
