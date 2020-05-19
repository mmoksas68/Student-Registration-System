package com.group29.srs.model;

public class ButtonName {
    String course_code;
    int section_number;
    String name;
    Long section_id;
    Long course_id;

    public ButtonName(String course_code, int section_number, String name, Long section_id, Long course_id) {
        this.course_code = course_code;
        this.section_number = section_number;
        this.name = name;
        this.section_id = section_id;
        this.course_id = course_id;
    }

    public ButtonName() {
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public int getSection_number() {
        return section_number;
    }

    public void setSection_number(int section_number) {
        this.section_number = section_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSection_id() {
        return section_id;
    }

    public void setSection_id(Long section_id) {
        this.section_id = section_id;
    }
    public Long getCourse_id() {
        return section_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }
}
