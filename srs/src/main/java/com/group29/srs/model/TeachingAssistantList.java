package com.group29.srs.model;

public class TeachingAssistantList {
    Long ta_id;
    String firstname;
    String lastname;

    public TeachingAssistantList(Long ta_id, String firstname, String lastname) {
        this.ta_id = ta_id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public TeachingAssistantList() {
    }

    public Long getTa_id() {
        return ta_id;
    }

    public void setTa_id(Long ta_id) {
        this.ta_id = ta_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
