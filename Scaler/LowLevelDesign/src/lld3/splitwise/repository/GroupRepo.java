package src.lld3.splitwise.repository;

import src.lld3.splitwise.model.Expense;
import src.lld3.splitwise.model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupRepo {

    private List<Group> groups = new ArrayList<>();

    public GroupRepo(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Expense> getExpensesByGroupName(String groupName) {
        for(Group group: groups) {
            if(groupName.equals(group.getName())) return group.getExpenses();
        }
        return new ArrayList<>();
    }
}
