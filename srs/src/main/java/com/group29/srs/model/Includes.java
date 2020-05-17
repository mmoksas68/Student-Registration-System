package com.group29.srs.model;

public class Includes {
    Long exam_id;
    Long course_id;
    Long section_id;

    public Includes() {
    }

    public Includes(Long exam_id, Long course_id, Long section_id) {
        this.exam_id = exam_id;
        this.course_id = course_id;
        this.section_id = section_id;
    }

    public Long getExam_id() {
        return exam_id;
    }

    public void setExam_id(Long exam_id) {
        this.exam_id = exam_id;
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
}
