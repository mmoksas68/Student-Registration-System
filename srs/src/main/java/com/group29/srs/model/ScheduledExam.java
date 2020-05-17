package com.group29.srs.model;

import java.sql.Date;

public class ScheduledExam {
    Long exam_id;
    Date e_date;
    String title;
    String reserved_time;

    public ScheduledExam() {
    }

    public ScheduledExam(Long exam_id, Date e_date, String title, String reserved_time) {
        this.exam_id = exam_id;
        this.e_date = e_date;
        this.title = title;
        this.reserved_time = reserved_time;
    }

    public Long getExam_id() {
        return exam_id;
    }

    public void setExam_id(Long exam_id) {
        this.exam_id = exam_id;
    }

    public Date getE_date() {
        return e_date;
    }

    public void setE_date(Date e_date) {
        this.e_date = e_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReserved_time() {
        return reserved_time;
    }

    public void setReserved_time(String reserved_time) {
        this.reserved_time = reserved_time;
    }
}
