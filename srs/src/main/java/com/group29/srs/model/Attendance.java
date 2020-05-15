package com.group29.srs.model;

import java.sql.Date;

public class Attendance {
    Long s_id;
    Long course_id;
    Long section_id;
    Date att_date;
    String title;
    int attendance_count;
    int lecture_count;

    public Attendance() {
    }

    public Attendance(Long s_id, Long course_id, Long section_id, Date att_date, String title, int attendance_count, int lecture_count) {
        this.s_id = s_id;
        this.course_id = course_id;
        this.section_id = section_id;
        this.att_date = att_date;
        this.title = title;
        this.attendance_count = attendance_count;
        this.lecture_count = lecture_count;
    }

    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
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

    public Date getAtt_date() {
        return att_date;
    }

    public void setAtt_date(Date att_date) {
        this.att_date = att_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAttendance_count() {
        return attendance_count;
    }

    public void setAttendance_count(int attendance_count) {
        this.attendance_count = attendance_count;
    }

    public int getLecture_count() {
        return lecture_count;
    }

    public void setLecture_count(int lecture_count) {
        this.lecture_count = lecture_count;
    }
}
