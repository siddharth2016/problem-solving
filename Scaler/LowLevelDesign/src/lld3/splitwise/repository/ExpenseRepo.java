package src.lld3.splitwise.repository;

import src.lld3.splitwise.model.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepo {

    private List<Expense> expenses = new ArrayList<>();

    public ExpenseRepo(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
