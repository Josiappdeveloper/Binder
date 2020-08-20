package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserData implements Serializable {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("birthDate")
    @Expose
    private String birthDate;
    @SerializedName("age")
    @Expose
    private Object age;
    @SerializedName("contactNumber")
    @Expose
    private String contactNumber;
    @SerializedName("zodiacSign")
    @Expose
    private String zodiacSign;
    @SerializedName("currentLocation")
    @Expose
    private String currentLocation;
    @SerializedName("currentCountry")
    @Expose
    private String currentCountry;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("motherTounge")
    @Expose
    private String motherTounge;
    @SerializedName("caste")
    @Expose
    private String caste;
    @SerializedName("religion")
    @Expose
    private String religion;
    @SerializedName("diet")
    @Expose
    private Object diet;
    @SerializedName("pets")
    @Expose
    private Object pets;
    @SerializedName("drink")
    @Expose
    private String drink;
    @SerializedName("smoke")
    @Expose
    private String smoke;
    @SerializedName("haveKids")
    @Expose
    private Object haveKids;
    @SerializedName("wantKids")
    @Expose
    private Object wantKids;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("firebaseId")
    @Expose
    private String firebaseId;
    @SerializedName("registerType")
    @Expose
    private String registerType;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private Object password;
    @SerializedName("isActive")
    @Expose
    private String isActive;
    @SerializedName("isDelete")
    @Expose
    private Object isDelete;
    @SerializedName("addID")
    @Expose
    private Object addID;
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
    @SerializedName("deleteIP")
    @Expose
    private Object deleteIP;
    @SerializedName("deleteID")
    @Expose
    private Object deleteID;
    @SerializedName("deleteDate")
    @Expose
    private Object deleteDate;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("maritalStatus")
    @Expose
    private String maritalStatus;
    @SerializedName("uniqueId")
    @Expose
    private String uniqueId;
    private final static long serialVersionUID = 8079098163448160405L;

    /**
     * No args constructor for use in serialization
     *
     */
    public UserData() {
    }

    /**
     *
     * @param pets
     * @param code
     * @param gender
     * @param zodiacSign
     * @param deleteIP
     * @param registerType
     * @param isActive
     * @param addIP
     * @param currentCountry
     * @param password
     * @param contactNumber
     * @param id
     * @param diet
     * @param deleteID
     * @param email
     * @param height
     * @param deleteDate
     * @param caste
     * @param isDelete
     * @param smoke
     * @param editID
     * @param userId
     * @param birthDate
     * @param addDate
     * @param editDate
     * @param drink
     * @param currentLocation
     * @param religion
     * @param haveKids
     * @param firebaseId
     * @param name
     * @param addID
     * @param motherTounge
     * @param editIP
     * @param age
     * @param wantKids
     * @param maritalStatus
     * @param uniqueId
     * @param username
     */
    public UserData(String id, String code, String userId, String name, String birthDate, Object age, String contactNumber, String zodiacSign, String currentLocation, String currentCountry, String height, String motherTounge, String caste, String religion, Object diet, Object pets, String drink, String smoke, Object haveKids, Object wantKids, String gender, String firebaseId, String registerType, String username, Object password, String isActive, Object isDelete, Object addID, String addIP, String addDate, Object editIP, Object editID, Object editDate, Object deleteIP, Object deleteID, Object deleteDate, String email, String maritalStatus, String uniqueId) {
        super();
        this.id = id;
        this.code = code;
        this.userId = userId;
        this.name = name;
        this.birthDate = birthDate;
        this.age = age;
        this.contactNumber = contactNumber;
        this.zodiacSign = zodiacSign;
        this.currentLocation = currentLocation;
        this.currentCountry = currentCountry;
        this.height = height;
        this.motherTounge = motherTounge;
        this.caste = caste;
        this.religion = religion;
        this.diet = diet;
        this.pets = pets;
        this.drink = drink;
        this.smoke = smoke;
        this.haveKids = haveKids;
        this.wantKids = wantKids;
        this.gender = gender;
        this.firebaseId = firebaseId;
        this.registerType = registerType;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
        this.isDelete = isDelete;
        this.addID = addID;
        this.addIP = addIP;
        this.addDate = addDate;
        this.editIP = editIP;
        this.editID = editID;
        this.editDate = editDate;
        this.deleteIP = deleteIP;
        this.deleteID = deleteID;
        this.deleteDate = deleteDate;
        this.email = email;
        this.maritalStatus = maritalStatus;
        this.uniqueId = uniqueId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMotherTounge() {
        return motherTounge;
    }

    public void setMotherTounge(String motherTounge) {
        this.motherTounge = motherTounge;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Object getDiet() {
        return diet;
    }

    public void setDiet(Object diet) {
        this.diet = diet;
    }

    public Object getPets() {
        return pets;
    }

    public void setPets(Object pets) {
        this.pets = pets;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    public Object getHaveKids() {
        return haveKids;
    }

    public void setHaveKids(Object haveKids) {
        this.haveKids = haveKids;
    }

    public Object getWantKids() {
        return wantKids;
    }

    public void setWantKids(Object wantKids) {
        this.wantKids = wantKids;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirebaseId() {
        return firebaseId;
    }

    public void setFirebaseId(String firebaseId) {
        this.firebaseId = firebaseId;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
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

    public Object getAddID() {
        return addID;
    }

    public void setAddID(Object addID) {
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

    public Object getDeleteIP() {
        return deleteIP;
    }

    public void setDeleteIP(Object deleteIP) {
        this.deleteIP = deleteIP;
    }

    public Object getDeleteID() {
        return deleteID;
    }

    public void setDeleteID(Object deleteID) {
        this.deleteID = deleteID;
    }

    public Object getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Object deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

}
