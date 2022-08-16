package com.example.toDo.ToDoListCreate;

import java.util.List;

public class   ToDoListReady {
    private String name;
    private List<ElementsToDo> components;

    public ToDoListReady(String name, List<ElementsToDo> components) {
        this.name = name;
        this.components = components;
    }

    public ToDoListReady() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElementsToDo> getComponents() {
        return components;
    }

    public void setComponents(List<ElementsToDo> components) {
        this.components = components;
    }
}
