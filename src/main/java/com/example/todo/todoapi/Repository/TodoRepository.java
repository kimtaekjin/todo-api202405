package com.example.todo.todoapi.Repository;

import com.example.todo.todoapi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,String> {

}
