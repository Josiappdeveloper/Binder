package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FieldofStudyList implements Serializable {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("fieldName")
    @Expose
    private String fieldName;
    @SerializedName("isActive")
    @Expose
    private String isActive;
    @SerializedName("isDelete")
    @Expose
    private Object isDelete;
    @SerializedName("addID")
    @Expose
    private String addID;
    @SerializedName("addIP")
    @Expose
    private String addIP;
    @SerializedName("addDate")
    @Expose
    private String addDate;
    @SerializedName("editIP")
    @Expose
    private Object editIP;
    @SerializedName("editID")
    @Expose
    private Object editID;
    @SerializedName("editDate")
    @Expose
    private Object editDate;
    @SerializedName("deleteID")
    @Expose
    private Object deleteID;
    @SerializedName("deleteIP")
    @Expose
    private Object deleteIP;
    @SerializedName("deleteDate")
    @Expose
    private Object deleteDate;

    /**
     * No args constructor for use in serialization
     *
     */
    public FieldofStudyList() {
    }

    /**
     *
     * @param code
     * @param fieldName
     * @param isDelete
     * @param editID
     * @param deleteIP
     * @param isActive
     * @param addIP
     * @param addDate
     * @param editDate
     * @param addID
     * @param id
     * @param editIP
     * @param deleteID
     * @param deleteDate
     */
    public FieldofStudyList(String id, String code, String fieldName, String isActive, Object isDelete, String addID, String addIP, String addDate, Object editIP, Object editID, Object editDate, Object deleteID, Object deleteIP, Object deleteDate) {
        super();
        this.id = id;
        this.code = code;
        this.fieldName = fieldName;
        this.isActive = isActive;
        this.isDelete = isDelete;
        this.addID = addID;
        this.addIP = addIP;
        this.addDate = addDate;
        this.editIP = editIP;
        this.editID = editID;
        this.editDate = editDate;
        this.deleteID = deleteID;
        this.deleteIP = deleteIP;
        this.deleteDate = deleteDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Object getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    public String getAddID() {
        return addID;
    }

    public void setAddID(String addID) {
        this.addID = addID;
    }

    public String getAddIP() {
        return addIP;
    }

    public void setAddIP(String addIP) {
        this.addIP = addIP;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public Object getEditIP() {
        return editIP;
    }

    public void setEditIP(Object editIP) {
        this.editIP = editIP;
    }

    public Object getEditID() {
        return editID;
    }

    public void setEditID(Object editID) {
        this.editID = editID;
    }

    public Object getEditDate() {
        return editDate;
    }

    public void setEditDate(Object editDate) {
        this.editDate = editDate;
    }

    public Object getDeleteID() {
        return deleteID;
    }

    public void setDeleteID(Object deleteID) {
        this.deleteID = deleteID;
    }

    public Object getDeleteIP() {
        return deleteIP;
    }

    public void setDeleteIP(Object deleteIP) {
        this.deleteIP = deleteIP;
    }

    public Object getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Object deleteDate) {
        this.deleteDate = deleteDate;
    }
}

