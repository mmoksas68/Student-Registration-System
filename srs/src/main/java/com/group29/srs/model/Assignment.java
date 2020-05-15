package com.group29.srs.model;

import java.sql.Date;

public class Assignment {
    Long assignment_id;
    String title;
    Date date;
    String type;
    Double average;

    public Assignment() {
    }

    public Assignment(Long assignment_id, String title, Date date, String type, Double average) {
        this.assignment_id = assignment_id;
        this.title = title;
        this.date = date;
        this.type = type;
        this.average = average;
    }

    public Long getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(Long assignment_id) {
        this.assignment_id = assignment_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }
}
