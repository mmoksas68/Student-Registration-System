package com.group29.srs.model;

public class Contains {
    Long assignment_id;
    Long course_id;

    public Contains() {
    }

    public Contains(Long assignment_id, Long course_id, Long section_id) {
        this.assignment_id = assignment_id;
        this.course_id = course_id;
        this.section_id = section_id;
    }

    public Long getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(Long assignment_id) {
        this.assignment_id = assignment_id;
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

    Long section_id;
}
