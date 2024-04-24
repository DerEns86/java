package de.v_ens.todo;

import java.util.ArrayList;
import java.util.List;


//TODO
// Erstelle eine neue Java-Klasse namens `TodoList`.
// Implementiere eine Datenstruktur, um Todos zu speichern, z.B. eine ArrayList.
// Implementiere Methoden zum Hinzufügen, Entfernen und Aktualisieren von Todos in der Liste.


public class TodoList {

    private List<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String todo) {
        todos.add(todo);
    }

    public void remove(String todo) {
        todos.remove(todo);
    }

    // Implementiere eine Datenstruktur, um Todos zu speichern, z.B. eine ArrayList.


    @Override
    public String toString() {
        return "TodoList{" +
                "todos=" + todos +
                '}';
    }
}
