package com.examly.springapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="taskmanagement")
public class Task {

    @Id
    private String taskId;
    private String taskHolderName;
    private String taskDat;
    private String taskName;
    private String taskStatus;

    public Task(){

    }

    public Task(String taskId, String taskHolderName, String taskDat, String taskName, String taskStatus) {
        this.taskId = taskId;
        this.taskHolderName = taskHolderName;
        this.taskDat = taskDat;
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskHolderName() {
        return taskHolderName;
    }

    public void setTaskHolderName(String taskHolderName) {
        this.taskHolderName = taskHolderName;
    }

    public String getTaskDat() {
        return taskDat;
    }

    public void setTaskDat(String taskDat) {
        this.taskDat = taskDat;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

}
