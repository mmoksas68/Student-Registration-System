package com.group29.srs.model;

public class Course {
    Long course_id;
    String course_code;
    String name;
    int credits ;
    String dept_code;
    Long coordinator_id ;

    public Course(Long course_id, String course_code, String name, int credits, String dept_code, Long coordinator_id) {
        this.course_id = course_id;
        this.course_code = course_code;
        this.name = name;
        this.credits = credits;
        this.dept_code = dept_code;
        this.coordinator_id = coordinator_id;
    }

    public Course() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public Long getCoordinator_id() {
        return coordinator_id;
    }

    public void setCoordinator_id(Long coordinator_id) {
        this.coordinator_id = coordinator_id;
    }
}
