package src.lld3.splitwise.repository;

import src.lld3.splitwise.model.UserExpense;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserExpRepo {

    private List<UserExpense> userExpenses = new ArrayList<>();

    public UserExpRepo(List<UserExpense> userExpenses) {
        this.userExpenses = userExpenses;
    }

    public List<UserExpense> getUserExpenses() {
        return userExpenses;
    }

    public void setUserExpenses(List<UserExpense> userExpenses) {
        this.userExpenses = userExpenses;
    }

    public List<UserExpense> getUserExpensesByExpenseName(String expenseName) {
        return userExpenses.stream()
                .filter(x -> expenseName.equals(x.getExpense().getName()))
                .collect(Collectors.toList());
    }
}
