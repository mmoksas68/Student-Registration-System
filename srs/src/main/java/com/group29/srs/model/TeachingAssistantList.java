package com.group29.srs.model;

public class TeachingAssistantList {
    Long ta_id;
    String firstname;
    String lastname;
    String course_code;
    int section_number;
    String task_type;

    public TeachingAssistantList(Long ta_id, String firstname, String lastname, String course_code, int section_number, String task_type) {
        this.ta_id = ta_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.course_code = course_code;
        this.section_number = section_number;
        this.task_type = task_type;
    }

    public TeachingAssistantList() {
    }

    public String getTask_type() {
        return task_type;
    }

    public void setTask_type(String task_type) {
        this.task_type = task_type;
    }

    public int getSection_number() {
        return section_number;
    }

    public void setSection_number(int section_number) {
        this.section_number = section_number;
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

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }
}
