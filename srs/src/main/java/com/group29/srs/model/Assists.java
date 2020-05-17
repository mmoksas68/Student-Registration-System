package com.group29.srs.model;

public class Assists {
    Long ta_id;
    Long course_id;

    public Assists() {
    }

    public Assists(Long ta_id, Long course_id) {
        this.ta_id = ta_id;
        this.course_id = course_id;
    }

    public Long getTa_id() {
        return ta_id;
    }

    public void setTa_id(Long ta_id) {
        this.ta_id = ta_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }
}
