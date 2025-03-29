package src.lld3.splitwise.model;

public class UserExpense {

    private User user;
    private Expense expense;
    private Integer amount;
    private UserExpenseType type;

    public UserExpense(User user, Expense expense, Integer amount, UserExpenseType type) {
        this.user = user;
        this.expense = expense;
        this.amount = amount;
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public UserExpenseType getType() {
        return type;
    }

    public void setType(UserExpenseType type) {
        this.type = type;
    }
}
