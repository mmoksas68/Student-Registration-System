package com.group29.srs.model;

public class Task {
    Long task_id;
    String task_type;

    public Task(Long task_id, String task_type) {
        this.task_id = task_id;
        this.task_type = task_type;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public String getTask_type() {
        return task_type;
    }

    public void setTask_type(String task_type) {
        this.task_type = task_type;
    }

    public Task() {
    }
}
