package com.group29.srs.model;

public class Phone {
    String phone_number;
    Long phone_id;

    public Phone() {

    }

    public Phone(String phone_number, Long phone_id) {
        this.phone_number = phone_number;
        this.phone_id = phone_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Long getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(Long phone_id) {
        this.phone_id = phone_id;
    }
}
