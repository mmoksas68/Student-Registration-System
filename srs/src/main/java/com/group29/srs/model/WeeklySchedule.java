package com.group29.srs.model;

import java.sql.Time;
public class WeeklySchedule {
    String course_code;
    String classroom ;
    int section_number;
    Time start_time;
    Time end_time;
    String start_day;
    int timeSlot;
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

    public void arrangeTimeSlot(){
        String[] days = {"mon", "tue", "wed", "thu", "fri"};
        Time[] t = new Time[9];
        for (int i=0; i < 9; i++){
            t [i] = new Time(8 + i, 40,0);
        }


        for (int i=0; i < days.length; i++){
            if (days[i].equals(start_day))
            {
                timeSlot = i*9;
                break;
            }
        }


        for (int i=0; i < t.length;i++){
            if (start_time.getTime() == t[i].getTime()){
                timeSlot+=i;
                break;
            }
            if (i+1 == t.length)
                timeSlot = -1;
        }



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

    @Override
    public String toString() {
        return "WeeklySchedule{" +
                "course_code='" + course_code + '\'' +
                ", classroom='" + classroom + '\'' +
                ", section_number=" + section_number +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", start_day='" + start_day + '\'' +
                ", timeSlot=" + timeSlot +
                '}';
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }
}
