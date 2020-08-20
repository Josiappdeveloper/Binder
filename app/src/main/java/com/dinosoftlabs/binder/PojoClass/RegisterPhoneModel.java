package com.dinosoftlabs.binder.PojoClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class RegisterPhoneModel implements Serializable {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("result")
    @Expose
    private RegisterPhoneResult registerPhoneResult;
    private final static long serialVersionUID = -3813853950181941641L;

    /**
     * No args constructor for use in serialization
     *
     */
    public RegisterPhoneModel() {
    }

    /**
     *
     * @param registerPhoneResult
     * @param message
     * @param status
     */
    public RegisterPhoneModel(String status, String message, RegisterPhoneResult registerPhoneResult) {
        super();
        this.status = status;
        this.message = message;
        this.registerPhoneResult = registerPhoneResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RegisterPhoneResult getRegisterPhoneResult() {
        return registerPhoneResult;
    }

    public void setRegisterPhoneResult(RegisterPhoneResult registerPhoneResult) {
        this.registerPhoneResult = registerPhoneResult;
    }
}
