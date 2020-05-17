package com.group29.srs.model;

public class ButtonName {
    String course_code;
    int section_number;
    String name;

    public ButtonName(String course_code, int section_number, String name) {
        this.course_code = course_code;
        this.section_number = section_number;
        this.name = name;
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
}
