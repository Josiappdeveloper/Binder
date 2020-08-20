package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RegisterPhoneResult implements Serializable {

    @SerializedName("userData")
    @Expose
    private UserData userData;
    private final static long serialVersionUID = 6514587610336321051L;

    /**
     * No args constructor for use in serialization
     *
     */
    public RegisterPhoneResult() {
    }

    /**
     *
     * @param userData
     */
    public RegisterPhoneResult(UserData userData) {
        super();
        this.userData = userData;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }
}
