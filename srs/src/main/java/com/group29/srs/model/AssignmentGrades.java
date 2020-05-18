package com.group29.srs.model;

public class AssignmentGrades {
    Long user_id;
    String firstname;
    String lastname;

    public AssignmentGrades(Long user_id, String firstname, String lastname) {
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public AssignmentGrades() {
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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
