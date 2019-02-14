package base.repo;

import base.model.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ToDoTaskRepository extends CrudRepository<User, Integer> {
    User findById(int id);
}