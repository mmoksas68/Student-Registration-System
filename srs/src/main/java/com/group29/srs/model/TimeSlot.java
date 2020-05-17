package com.group29.srs.model;

import java.sql.Time;

public class TimeSlot {
    Long time_id;
    Time start_time;
    Time end_time;
    Enum start_day;

    public TimeSlot() {
    }

    public TimeSlot(Long time_id, Time start_time, Time end_time, Enum start_day) {
        this.time_id = time_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.start_day = start_day;
    }

    public Long getTime_id() {
        return time_id;
    }

    public void setTime_id(Long time_id) {
        this.time_id = time_id;
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

    public Enum getStart_day() {
        return start_day;
    }

    public void setStart_day(Enum start_day) {
        this.start_day = start_day;
    }
}
