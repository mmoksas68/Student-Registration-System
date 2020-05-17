package com.group29.srs.model;

public class TeachingAssistant {
    Long ta_id;
    int office_no;
    int office_hours;

    public TeachingAssistant() {
    }

    public TeachingAssistant(Long ta_id, int office_no, int office_hours) {
        this.ta_id = ta_id;
        this.office_no = office_no;
        this.office_hours = office_hours;
    }

    public Long getTa_id() {
        return ta_id;
    }

    public void setTa_id(Long ta_id) {
        this.ta_id = ta_id;
    }

    public int getOffice_no() {
        return office_no;
    }

    public void setOffice_no(int office_no) {
        this.office_no = office_no;
    }

    public int getOffice_hours() {
        return office_hours;
    }

    public void setOffice_hours(int office_hours) {
        this.office_hours = office_hours;
    }
}
