package src.lld3.splitwise.strategy;

import src.lld3.splitwise.model.Transaction;
import src.lld3.splitwise.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxHeapStrategy implements SettlementStrategy {

    PriorityQueue<Pair> receivers = new PriorityQueue<>();
    PriorityQueue<Pair> givers = new PriorityQueue<>();

    @Override
    public List<Transaction> settleUserExpenses(Map<User, Integer> settleMap) {
        List<Transaction> transactions = new ArrayList<>();

        for(User user: settleMap.keySet()) {
            int amt = settleMap.get(user);
            if(amt < 0) givers.add(new Pair(user, -1*amt));
            else receivers.add(new Pair(user, amt));
        }

        while(receivers.size()>0 && givers.size()>0) {
            Pair receiver = receivers.poll();
            Pair giver = givers.poll();
            transactions.add(new Transaction(giver.getUser().getName(), receiver.getUser().getName(), giver.getAmount()));
            int amountRem = receiver.getAmount() - giver.getAmount();

            if(amountRem > 0) receivers.add(new Pair(receiver.getUser(), amountRem));
        }

        return transactions;
    }


}

class Pair implements Comparable<Pair> {

    private User user;
    private Integer amount;

    public Pair(User user, Integer amount) {
        this.user = user;
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Pair otherPair) {
        return Integer.compare(otherPair.amount, this.amount);
    }
}