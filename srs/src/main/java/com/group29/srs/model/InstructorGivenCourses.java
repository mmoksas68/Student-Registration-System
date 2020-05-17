package com.group29.srs.model;

public class InstructorGivenCourses {
    String course_code;
    String name;
    String classroom;
    int  section_number;

    public InstructorGivenCourses(String course_code, String name, String classroom, int section_number) {
        this.course_code = course_code;
        this.name = name;
        this.classroom = classroom;
        this.section_number = section_number;
    }

    public InstructorGivenCourses() {
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
