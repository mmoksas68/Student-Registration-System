package com.group29.srs.model;

import java.sql.Time;

public class WeeklySchedule {
    String course_code;
    String classroom ;
    int section_number;
    Time start_time;
    Time end_time;
    String start_day;

    public WeeklySchedule(String course_code, String classroom, int section_number, Time start_time, Time end_time, String start_day) {
        this.course_code = course_code;
        this.classroom = classroom;
        this.section_number = section_number;
        this.start_time = start_time;
        this.end_time = end_time;
        this.start_day = start_day;
    }

    public WeeklySchedule() {
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
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

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    public String getStart_day() {
        return start_day;
    }

    public void setStart_day(String start_day) {
        this.start_day = start_day;
    }
}
