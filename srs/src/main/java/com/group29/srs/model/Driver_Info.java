package com.group29.srs.model;

public class Driver_Info {
    String firstname;
    String lastname;
    String driver_license_no;
    Long penalty_point;

    public Driver_Info(String firstname, String lastname, String driver_license_no, Long penalty_point) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.driver_license_no = driver_license_no;
        this.penalty_point = penalty_point;
    }

    public Driver_Info() {
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

    public String getDriver_license_no() {
        return driver_license_no;
    }

    public void setDriver_license_no(String driver_license_no) {
        this.driver_license_no = driver_license_no;
    }

    public Long getPenalty_point() {
        return penalty_point;
    }

    public void setPenalty_point(Long penalty_point) {
        this.penalty_point = penalty_point;
    }

    @Override
    public String toString() {
        return "Driver_Info{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", driver_license_no='" + driver_license_no + '\'' +
                ", penalty_point=" + penalty_point +
                '}';
    }
}
