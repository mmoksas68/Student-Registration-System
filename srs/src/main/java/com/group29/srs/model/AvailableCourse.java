package com.group29.srs.model;

public class AvailableCourse {
    Long course_id;
    String course_code;
    long section_id;
    String name;
    String firstname;
    String lastname;
    int available_quota;
    int total_quota;

    public AvailableCourse() {
    }

    public AvailableCourse(long course_id, String course_code, long section_id, String name, String firstname, String lastname, int available_quota, int total_quota) {
        this.course_id = course_id;
        this.course_code = course_code;
        this.section_id = section_id;
        this.name = name;
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
