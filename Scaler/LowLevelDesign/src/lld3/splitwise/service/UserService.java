package src.lld3.splitwise.service;

import src.lld3.splitwise.model.Expense;
import src.lld3.splitwise.model.Transaction;
import src.lld3.splitwise.model.User;
import src.lld3.splitwise.model.UserExpense;
import src.lld3.splitwise.repository.GroupRepo;
import src.lld3.splitwise.repository.UserExpRepo;
import src.lld3.splitwise.strategy.SettlementStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static src.lld3.splitwise.model.UserExpenseType.PAID;

public class UserService {

    private final UserExpRepo userExpRepo;
    private final GroupRepo groupRepo;
    private SettlementStrategy settlementStrategy;

    public UserService(UserExpRepo userExpRepo, GroupRepo groupRepo, SettlementStrategy settlementStrategy) {
        this.userExpRepo = userExpRepo;
        this.groupRepo = groupRepo;
        this.settlementStrategy = settlementStrategy;
    }

    public List<Transaction> settleUp(String userName, String groupName) {

        // we will pass this map to settlement strategy
        Map<User, Integer> amountToSettleMap = new HashMap<>();

        List<Expense> expenses = groupRepo.getExpensesByGroupName(groupName);
        List<UserExpense> userExpenses = new ArrayList<>();
        for(Expense expense: expenses) {
            userExpenses.addAll(userExpRepo.getUserExpensesByExpenseName(expense.getName()));
        }

        for(UserExpense userExpense: userExpenses) {
            if(!amountToSettleMap.containsKey(userExpense.getUser())) amountToSettleMap.put(userExpense.getUser(), 0);

            int amount = amountToSettleMap.get(userExpense.getUser());
            if(PAID.equals(userExpense.getType())) {
                amountToSettleMap.put(userExpense.getUser(), amount+userExpense.getAmount());
            }
            else {
                amountToSettleMap.put(userExpense.getUser(), amount-userExpense.getAmount());
            }
        }

        List<Transaction> groupTrasactions = settlementStrategy.settleUserExpenses(amountToSettleMap);
        List<Transaction> userTransactions = new ArrayList<>();

        for(Transaction transaction: groupTrasactions) {
            if(userName.equals(transaction.getFrom()) || userName.equals(transaction.getTo())) {
                userTransactions.add(transaction);
            }
        }

        return userTransactions;
    }

}
