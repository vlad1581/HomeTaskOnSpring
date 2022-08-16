package com.example.toDo.ToDoListCreate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


import java.util.HashMap;
import java.util.Map;

@Component
public class ComponentByIdConverter implements Converter <String, ElementsToDo> {
    private Map<String, ElementsToDo> componentsMap = new HashMap<>();
    public ComponentByIdConverter(){
        componentsMap.put("components",
                new ElementsToDo());
    }

    @Override
    public ElementsToDo convert(String id){
        return componentsMap.get(id);
    }
}
