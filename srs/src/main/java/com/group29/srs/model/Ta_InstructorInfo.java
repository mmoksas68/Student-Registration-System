package com.group29.srs.model;

public class Ta_InstructorInfo {
    String firstname;
    String lastname;
    String mail;
    String dept_name;
    String phone_number;
    Long id;
    String office_no;

    public Ta_InstructorInfo(String firstname, String lastname, String mail, String dept_name, String phone_number, Long id, String office_no) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.dept_name = dept_name;
        this.phone_number = phone_number;
        this.id = id;
        this.office_no = office_no;
    }

    public Ta_InstructorInfo() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOffice_no() {
        return office_no;
    }

    public void setOffice_no(String office_no) {
        this.office_no = office_no;
    }
}
