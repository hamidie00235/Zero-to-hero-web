package com.hamidie.mongodbapi.Service;

import com.hamidie.mongodbapi.Model.Task;
import com.hamidie.mongodbapi.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceTask {
    @Autowired
    private TaskRepository repository;


    //crud task :create,read,update and delete
    public Task addTask(Task task){

        task.setTaskId(UUID.randomUUID().toString().split(regex: "-")[0]);
        return repository.save(task);


    }
    public List<Task> findAllTask() {
        return repository.findAll();
    }
            public Task getTaskByTaskId( String taskId ){
                return repository.findBy(taskId).get();
        }
    public List<Task> getTaskBySeverity(int severiry){
        return repository.findBySeverity(severiry;


    }
    public List<Task> getTaskByAssignee(String assignee){
        return repository.getTasksByAssignee(assignee);
    }
    public Task updateTask(Task taskRequest){
      //get the existing document fron Db
      //populate new value from request to existing
    }
    }

