package com.group29.srs.model;

public class Instructor {
    Long instructor_id;
    int office_no;
    int office_hours;

    public Instructor() {
    }

    public Instructor(Long instructor_id, int office_no, int office_hours) {
        this.instructor_id = instructor_id;
        this.office_no = office_no;
        this.office_hours = office_hours;
    }

    public Long getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(Long instructor_id) {
        this.instructor_id = instructor_id;
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
