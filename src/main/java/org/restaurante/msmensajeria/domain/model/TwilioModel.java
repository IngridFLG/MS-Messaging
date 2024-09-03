package org.restaurante.msmensajeria.domain.model;

public class TwilioModel {

    private String phoneNumber;

    private Integer message;

    public TwilioModel() {
    }

    public TwilioModel(String phoneNumber, Integer message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }
}
