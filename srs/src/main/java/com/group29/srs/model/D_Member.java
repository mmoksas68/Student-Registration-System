package com.group29.srs.model;

public class D_Member {
    Long user_id;
    String dept_code;

    public D_Member() {
    }

    public D_Member(Long user_id, String dept_code) {
        this.user_id = user_id;
        this.dept_code = dept_code;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }
}
