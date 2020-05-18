package com.group29.srs.model;

public class Grades {
    String title;
    String date;
    String type;
    Double average;
    int grade;

    public Grades(String title, String date, String type, Double average, int grade) {
        this.title = title;
        this.date = date;
        this.type = type;
        this.average = average;
        this.grade = grade;
    }

    public Grades() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
