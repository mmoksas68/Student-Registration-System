package com.group29.srs.model;

public class Curriculum {
    String dept_code;
    Long course_id;
    Enum court_type;
    Enum semester;

    public Curriculum() {
    }

    public Curriculum(String dept_code, Long course_id, Enum court_type, Enum semester, int year) {
        this.dept_code = dept_code;
        this.course_id = course_id;
        this.court_type = court_type;
        this.semester = semester;
        this.year = year;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Enum getCourt_type() {
        return court_type;
    }

    public void setCourt_type(Enum court_type) {
        this.court_type = court_type;
    }

    public Enum getSemester() {
        return semester;
    }

    public void setSemester(Enum semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    int year;
}
