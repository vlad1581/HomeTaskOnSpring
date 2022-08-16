package com.example.toDo.ToDoListCreate;

import java.text.DateFormat;

public class ElementsToDo {
    private DateFormat date;
    private String notices;

    public ElementsToDo(DateFormat date, String notices) {
        this.date = date;
        this.notices = notices;
    }

    public ElementsToDo() {

    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }


    public String getNotices() {
        return notices;
    }

    public void setNotices(String notices) {
        this.notices = notices;
    }

}
