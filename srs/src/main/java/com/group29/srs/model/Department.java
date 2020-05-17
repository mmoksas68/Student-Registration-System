package com.group29.srs.model;

public class Department {
    String dept_code;
    String dept_name;
    String building;

    public Department() {
    }

    public Department(String dept_code, String dept_name, String building) {
        this.dept_code = dept_code;
        this.dept_name = dept_name;
        this.building = building;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
