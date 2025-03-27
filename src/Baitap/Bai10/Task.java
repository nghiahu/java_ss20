package Baitap.Bai10;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private User assingedTo;
    private LocalDate dueDate;
    private boolean completed;

    public Task() {
    }

    public Task(int id, String title, User assingedTo, LocalDate dueDate, boolean completed) {
        this.id = id;
        this.title = title;
        this.assingedTo = assingedTo;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAssingedTo() {
        return assingedTo;
    }

    public void setAssingedTo(User assingedTo) {
        this.assingedTo = assingedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
