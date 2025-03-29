package src.lld3.splitwise;

import src.lld3.splitwise.controller.UserController;
import src.lld3.splitwise.model.*;
import src.lld3.splitwise.repository.ExpenseRepo;
import src.lld3.splitwise.repository.GroupRepo;
import src.lld3.splitwise.repository.UserExpRepo;
import src.lld3.splitwise.repository.UserRepo;
import src.lld3.splitwise.service.UserService;
import src.lld3.splitwise.strategy.MaxHeapStrategy;
import src.lld3.splitwise.strategy.SettlementStrategy;

import java.util.ArrayList;
import java.util.List;

public class RunApp {

    public static void main(String[] args) {

        User user1 = new User("Siddharth");
        User user2 = new User("Ayush");
        User user3 = new User("Abhishek");
        User user4 = new User("Pandey");
        User user5 = new User("Shiv");
        List<User> users = new ArrayList<>();
        users.add(user1); users.add(user2); users.add(user3); users.add(user4); users.add(user5);

        Expense expense1 = new Expense("EXP1", 5000, ExpenseType.NORMAL);
        Expense expense2 = new Expense("EXP2", 10000, ExpenseType.NORMAL);
        List<Expense> expenses = new ArrayList<>();
        expenses.add(expense1); expenses.add(expense2);

        List<UserExpense> userExpenses = new ArrayList<>();
//        userExpenses.add(new UserExpense(user1, expense1, 3000, UserExpenseType.PAID));
//        userExpenses.add(new UserExpense(user1, expense1, 1000, UserExpenseType.HAD_TO_PAY));
//        userExpenses.add(new UserExpense(user2, expense1, 1000, UserExpenseType.HAD_TO_PAY));
//        userExpenses.add(new UserExpense(user3, expense1, 1000, UserExpenseType.HAD_TO_PAY));
//        userExpenses.add(new UserExpense(user4, expense1, 1000, UserExpenseType.HAD_TO_PAY));
//        userExpenses.add(new UserExpense(user5, expense1, 1000, UserExpenseType.HAD_TO_PAY));
//        userExpenses.add(new UserExpense(user3, expense1, 2000, UserExpenseType.PAID));

        userExpenses.add(new UserExpense(user2, expense2, 6000, UserExpenseType.PAID));
        userExpenses.add(new UserExpense(user5, expense2, 2000, UserExpenseType.PAID));
        userExpenses.add(new UserExpense(user1, expense2, 2000, UserExpenseType.PAID));

        userExpenses.add(new UserExpense(user2, expense2, 2000, UserExpenseType.HAD_TO_PAY));
        userExpenses.add(new UserExpense(user3, expense2, 2000, UserExpenseType.HAD_TO_PAY));
        userExpenses.add(new UserExpense(user4, expense2, 2000, UserExpenseType.HAD_TO_PAY));
        userExpenses.add(new UserExpense(user5, expense2, 2000, UserExpenseType.HAD_TO_PAY));
        userExpenses.add(new UserExpense(user1, expense2, 2000, UserExpenseType.HAD_TO_PAY));


        List<Group> groups = new ArrayList<>();
        groups.add(new Group("GRP1", users, expenses));

        UserRepo userRepo = new UserRepo(users);
        ExpenseRepo expenseRepo = new ExpenseRepo(expenses);
        UserExpRepo userExpRepo = new UserExpRepo(userExpenses);
        GroupRepo groupRepo = new GroupRepo(groups);

        SettlementStrategy maxHeapStrategy = new MaxHeapStrategy();

        UserService userService = new UserService(userExpRepo, groupRepo, maxHeapStrategy);

        UserController userController = new UserController(userService);

        List<Transaction> transactions1 = userController.settleUp("Siddharth", "GRP1");
        List<Transaction> transactions2 = userController.settleUp("Pandey", "GRP1");

        for(Transaction trn: transactions1) {
            System.out.println(trn);
        }

        System.out.println("===========");

        for(Transaction trn: transactions2) {
            System.out.println(trn);
        }
    }

}
