package src.lld3.splitwise.model;

import java.util.List;

public class Group {

    private String name;
    private List<User> users;
    private List<Expense> expenses;

    public Group(String name, List<User> users, List<Expense> expenses) {
        this.name = name;
        this.users = users;
        this.expenses = expenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
