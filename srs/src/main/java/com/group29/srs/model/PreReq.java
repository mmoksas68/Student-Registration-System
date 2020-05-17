package com.group29.srs.model;

public class PreReq {
    Long course_id;
    Long req_id;

    public PreReq() {
    }

    public PreReq(Long course_id, Long req_id) {
        this.course_id = course_id;
        this.req_id = req_id;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Long getReq_id() {
        return req_id;
    }

    public void setReq_id(Long req_id) {
        this.req_id = req_id;
    }
}
