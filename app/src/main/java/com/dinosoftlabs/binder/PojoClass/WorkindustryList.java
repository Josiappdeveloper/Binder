package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WorkindustryList implements Serializable {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("industryName")
    @Expose
    private String industryName;
    @SerializedName("slugName")
    @Expose
    private Object slugName;
    @SerializedName("isPopular")
    @Expose
    private Object isPopular;
    @SerializedName("isActive")
    @Expose
    private String isActive;
    @SerializedName("isDelete")
    @Expose
    private Object isDelete;
    @SerializedName("addID")
    @Expose
    private String addID;
    @SerializedName("editID")
    @Expose
    private Object editID;
    @SerializedName("deleteID")
    @Expose
    private Object deleteID;
    @SerializedName("addIP")
    @Expose
    private String addIP;
    @SerializedName("editIP")
    @Expose
    private Object editIP;
    @SerializedName("deleteIP")
    @Expose
    private Object deleteIP;
    @SerializedName("addDate")
    @Expose
    private String addDate;
    @SerializedName("editDate")
    @Expose
    private String editDate;
    @SerializedName("deleteDate")
    @Expose
    private Object deleteDate;
    private final static long serialVersionUID = -4254467923702455403L;

    /**
     * No args constructor for use in serialization
     *
     */
    public WorkindustryList() {
    }

    /**
     *
     * @param industryName
     * @param code
     * @param isDelete
     * @param slugName
     * @param editID
     * @param deleteIP
     * @param isActive
     * @param addIP
     * @param addDate
     * @param editDate
     * @param isPopular
     * @param addID
     * @param id
     * @param deleteID
     * @param editIP
     * @param deleteDate
     */
    public WorkindustryList(String id, String code, String industryName, Object slugName, Object isPopular, String isActive, Object isDelete, String addID, Object editID, Object deleteID, String addIP, Object editIP, Object deleteIP, String addDate, String editDate, Object deleteDate) {
        super();
        this.id = id;
        this.code = code;
        this.industryName = industryName;
        this.slugName = slugName;
        this.isPopular = isPopular;
        this.isActive = isActive;
        this.isDelete = isDelete;
        this.addID = addID;
        this.editID = editID;
        this.deleteID = deleteID;
        this.addIP = addIP;
        this.editIP = editIP;
        this.deleteIP = deleteIP;
        this.addDate = addDate;
        this.editDate = editDate;
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

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public Object getSlugName() {
        return slugName;
    }

    public void setSlugName(Object slugName) {
        this.slugName = slugName;
    }

    public Object getIsPopular() {
        return isPopular;
    }

    public void setIsPopular(Object isPopular) {
        this.isPopular = isPopular;
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

    public Object getEditID() {
        return editID;
    }

    public void setEditID(Object editID) {
        this.editID = editID;
    }

    public Object getDeleteID() {
        return deleteID;
    }

    public void setDeleteID(Object deleteID) {
        this.deleteID = deleteID;
    }

    public String getAddIP() {
        return addIP;
    }

    public void setAddIP(String addIP) {
        this.addIP = addIP;
    }

    public Object getEditIP() {
        return editIP;
    }

    public void setEditIP(Object editIP) {
        this.editIP = editIP;
    }

    public Object getDeleteIP() {
        return deleteIP;
    }

    public void setDeleteIP(Object deleteIP) {
        this.deleteIP = deleteIP;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }

    public Object getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Object deleteDate) {
        this.deleteDate = deleteDate;
    }

}
