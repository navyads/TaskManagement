package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    
    @Autowired
    public TaskService ts;

    @PostMapping("/saveTask")
    public void addTask(@RequestBody Task task){
        ts.addTask(task);
    }

    @PostMapping("/changeStatus/{taskId}")
    public void editTask(@PathVariable String taskId, @RequestBody Task task){
        ts.editTask(taskId, task);
    }

    @DeleteMapping("/deleteHouse/{taskId}")
    public String deleteTask(@PathVariable String taskId){
        return ts.deleteTask(taskId);
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks(){
        return ts.getAllTasks();
    }

    @GetMapping("/getTask/{taskHolderName}")
    public List<Task> getByTaskHolderName(@PathVariable String taskHolderName, @RequestBody Task task){
        return ts.getByTaskHolderName(taskHolderName, task);
    }

}
