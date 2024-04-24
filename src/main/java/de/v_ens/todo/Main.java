package de.v_ens.todo;

public class Main {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();
        Todo t1 = new Todo("Einkaufen", "Test1, Test2, Test3", false);

        System.out.println(t1);
        todoList.add(t1.toString());
        System.out.println(todoList);

        t1.setDone(true);

        System.out.println(t1);

    }
}

//TODO
// Eine konsolenbasierte Eingabe erstellen
//Funktionalität testen
// Schreibe Tests, um sicherzustellen, dass deine Todo-Klasse und deine TodoList-Klasse wie erwartet funktionieren.
// Teste auch die Benutzeroberfläche, um sicherzustellen, dass Benutzeraktionen wie das Hinzufügen oder Entfernen von Todos korrekt verarbeitet werden.

