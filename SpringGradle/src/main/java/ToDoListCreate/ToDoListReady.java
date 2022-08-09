package ToDoListCreate;

import java.util.List;

public class ToDoListReady {
    private String name;
    private List<Component> components;

    public ToDoListReady(String name, List<Component> components) {
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

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
