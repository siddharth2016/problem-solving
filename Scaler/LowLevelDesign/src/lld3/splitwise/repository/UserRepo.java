package src.lld3.splitwise.repository;

import src.lld3.splitwise.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private List<User> users = new ArrayList<>();

    public UserRepo(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
