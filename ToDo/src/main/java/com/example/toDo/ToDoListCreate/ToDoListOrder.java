package com.example.toDo.ToDoListCreate;

import java.util.ArrayList;
import java.util.List;

public class ToDoListOrder {
    public List<ToDoListReady> todo = new ArrayList<>();
    public void addToDo(ToDoListReady toDo){
        this.todo.add(toDo);
    }

    public List<ToDoListReady> getTodo() {
        return todo;
    }

    public void setTodo(List<ToDoListReady> todo) {
        this.todo = todo;
    }
}
