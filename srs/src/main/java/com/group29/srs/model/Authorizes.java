package com.group29.srs.model;

public class Authorizes {
    Long task_id;
    Long instructor_id;
    Long ta_id;

    public Authorizes() {
    }

    public Authorizes(Long task_id, Long instructor_id, Long ta_id) {
        this.task_id = task_id;
        this.instructor_id = instructor_id;
        this.ta_id = ta_id;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public Long getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(Long instructor_id) {
        this.instructor_id = instructor_id;
    }

    public Long getTa_id() {
        return ta_id;
    }

    public void setTa_id(Long ta_id) {
        this.ta_id = ta_id;
    }
}
