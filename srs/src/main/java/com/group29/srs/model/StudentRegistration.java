package com.group29.srs.model;

public class StudentRegistration {
    Long course_id;
    String course_code;
    String name;
    String course_type;

    long section_id;
    String firstname;
    String lastname;
    int available_quota;
    int total_quota;

    public StudentRegistration() {
    }

    public StudentRegistration(Long course_id, String course_code, String name, String course_type, long section_id, String firstname, String lastname, int available_quota, int total_quota) {
        this.course_id = course_id;
        this.course_code = course_code;
        this.name = name;
        this.course_type = course_type;

        this.section_id = section_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.available_quota = available_quota;
        this.total_quota = total_quota;
    }


    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public long getSection_id() {
        return section_id;
    }

    public void setSection_id(long section_id) {
        this.section_id = section_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAvailable_quota() {
        return available_quota;
    }

    public void setAvailable_quota(int available_quota) {
        this.available_quota = available_quota;
    }

    public int getTotal_quota() {
        return total_quota;
    }

    public void setTotal_quota(int total_quota) {
        this.total_quota = total_quota;
    }

}
