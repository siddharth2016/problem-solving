package src.lld3.splitwise.strategy;

import src.lld3.splitwise.model.Transaction;
import src.lld3.splitwise.model.User;

import java.util.List;
import java.util.Map;

public interface SettlementStrategy {

    List<Transaction> settleUserExpenses(Map<User, Integer> settleMap);

}
