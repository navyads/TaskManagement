package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, String>{
    public Task findByTaskHolderName(String taskHoldeString);
}
