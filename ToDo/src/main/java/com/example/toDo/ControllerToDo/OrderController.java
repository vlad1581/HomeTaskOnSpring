package com.example.toDo.ControllerToDo;

import com.example.toDo.ToDoListCreate.ToDoListOrder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(){
        return "orderForm";
    }

    @PostMapping
    public String processOrder(ToDoListOrder order, SessionStatus sessionStatus){
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
