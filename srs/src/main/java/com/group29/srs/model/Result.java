package com.group29.srs.model;

public class Result {
    Long student_id;
    Long assignment_id;
    int grade;

    public Result() {
    }

    public Result(Long student_id, Long assignment_id, int grade) {
        this.student_id = student_id;
        this.assignment_id = assignment_id;
        this.grade = grade;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(Long assignment_id) {
        this.assignment_id = assignment_id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
