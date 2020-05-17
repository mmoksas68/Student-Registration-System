package com.group29.srs.model;

public class Has {
    Long time_id ;
    Long course_id;
    Long section_id;

    public Has() {
    }

    public Has(Long time_id, Long course_id, Long section_id) {
        this.time_id = time_id;
        this.course_id = course_id;
        this.section_id = section_id;
    }

    public Long getTime_id() {
        return time_id;
    }

    public void setTime_id(Long time_id) {
        this.time_id = time_id;
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
