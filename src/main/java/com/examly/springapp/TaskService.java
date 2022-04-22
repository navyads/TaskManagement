package com.examly.springapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskService {
    
    @Autowired
    public TaskRepository tr;

    public List<Task> getAllTasks(){
        List<Task> t=new ArrayList<Task>();
        tr.findAll().forEach(t::add);
        return t;
    }

    public void addTask(Task task){
        tr.save(task);
    }

    public void editTask(String taskId, Task task){
        tr.save(task);
    }

    public String deleteTask(String taskId) {
        tr.deleteById(taskId);
        return "Deleted Successfully";
    }

    public List<Task> getByTaskHolderName(String taskHolderName, Task task){
        List<Task> a=new ArrayList<Task>();
        task.setTaskHolderName(taskHolderName);
        if(task.getTaskHolderName().toString()==taskHolderName)
            a.add(task);
        return a;    
    }
}
