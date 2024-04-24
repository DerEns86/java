package de.v_ens.todo;


public class Todo {

    private String title;
    private String description;
    private boolean done;

    public Todo() {
    }

    public Todo(String title, String description, boolean done) {
        this.title = title;
        this.description = description;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}
