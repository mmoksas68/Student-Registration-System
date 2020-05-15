package com.group29.srs.model;

public class Section {
    Long course_id;
    Long section_id;
    String classroom ;
    int section_number;
    Enum semester;
    int year;
    int available_quota;
    int total_quota;
    Long teacher_id;
    public Section() {

    }

    public Section(Long course_id, Long section_id, String classroom, int section_number, Enum semester, int year, int available_quota, int total_quota, Long teacher_id) {
        this.course_id = course_id;
        this.section_id = section_id;
        this.classroom = classroom;
        this.section_number = section_number;
        this.semester = semester;
        this.year = year;
        this.available_quota = available_quota;
        this.total_quota = total_quota;
        this.teacher_id = teacher_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getSection_id() {
        return section_id;
    }

    public void setSection_id(Long section_id) {
        this.section_id = section_id;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getSection_number() {
        return section_number;
    }

    public void setSection_number(int section_number) {
        this.section_number = section_number;
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

    public Long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Long teacher_id) {
        this.teacher_id = teacher_id;
    }
}
