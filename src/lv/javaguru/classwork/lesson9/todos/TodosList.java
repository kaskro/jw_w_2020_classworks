package lv.javaguru.classwork.lesson9.todos;

import java.util.ArrayList;
import java.util.List;

public class TodosList {

    private List<String> allTodos = new ArrayList<>();

    public void add(String todo) {
        allTodos.add(todo);
    }

    public void remove(String todo) {
        allTodos.remove(todo);
    }

    public List<String> getAllTodos() {
        return allTodos;
    }
}
