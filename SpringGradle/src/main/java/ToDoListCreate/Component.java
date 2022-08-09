package ToDoListCreate;

import java.text.DateFormat;

public class Component {
    private DateFormat date;
    private DateFormat time;
    private String notices;

    public Component(DateFormat date, DateFormat time, String notices) {
        this.date = date;
        this.time = time;
        this.notices = notices;
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public DateFormat getTime() {
        return time;
    }

    public void setTime(DateFormat time) {
        this.time = time;
    }

    public String getNotices() {
        return notices;
    }

    public void setNotices(String notices) {
        this.notices = notices;
    }

}
