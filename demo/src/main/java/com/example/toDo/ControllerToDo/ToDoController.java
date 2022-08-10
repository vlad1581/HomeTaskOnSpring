package com.example.toDo.ControllerToDo;



import com.example.toDo.ToDoListCreate.Component;
import com.example.toDo.ToDoListCreate.ToDoListReady;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/list")
public class ToDoController {

    @ModelAttribute
    public void addToDoList(Model model){
        List<Component> components = new ArrayList<>();
        model.addAttribute(components);

    }

    @ModelAttribute(name = "toDoList")
    public ToDoListReady toDo(){
        return new ToDoListReady();
    }

    @GetMapping
    public String showPage(){
        return "list";
    }



}
