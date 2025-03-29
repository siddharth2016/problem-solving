package src.lld3.splitwise.controller;

import src.lld3.splitwise.model.Transaction;
import src.lld3.splitwise.service.UserService;

import java.util.List;

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public List<Transaction> settleUp(String userName, String groupName) {
        return userService.settleUp(userName, groupName);
    }

}
