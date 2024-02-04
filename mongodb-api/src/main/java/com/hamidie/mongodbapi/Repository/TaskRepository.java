package com.hamidie.mongodbapi.Repository;


import com.hamidie.mongodbapi.Model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

;import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {
    List<Task> findBySeverity(int severiry);
    @Query(" {assignee: ?0 }")

    List<Task> getTasksByAssignee(String assignee);
}
