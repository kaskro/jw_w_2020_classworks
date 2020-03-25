package lv.javaguru.classwork.lesson9.todos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TodosListTest {

    private TodosList todosList;

    @BeforeEach
    void setUp() {
        todosList = new TodosList();
    }

    @Test
    void shouldRetrieveAllTodos() {
        assertEquals(new ArrayList<>(), todosList.getAllTodos());
    }

    @Test
    void shouldAddTodoItem() {
        final String myTodo = "Wash my hands";
        todosList.add(myTodo);

        assertNotNull(todosList.getAllTodos());
        assertEquals(1, todosList.getAllTodos().size());
        assertEquals(myTodo, todosList.getAllTodos().get(0));
    }

    @Test
    void shouldRemoveTodoItem() {
        final String myFirstTodo = "Wash my hands";
        final String mySecondTodo = "Sanitise my hands";
        todosList.add(myFirstTodo);
        todosList.add(mySecondTodo);
        todosList.remove(myFirstTodo);

        assertNotNull(todosList.getAllTodos());
        assertEquals(1, todosList.getAllTodos().size());
        assertEquals(mySecondTodo, todosList.getAllTodos().get(0));
    }

    @Test
    void shouldNotRemoveTodoItem() {
        final String myfirstTodo = "Wash my hands";
        final String mySecondTodo = "Sanitise my hands";
        todosList.add(myfirstTodo);
        todosList.remove(mySecondTodo);

        assertEquals(1, todosList.getAllTodos().size());
    }
}