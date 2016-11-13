package models;

import java.util.ArrayList;

public class Group {
    private String groupName;
    private ArrayList<User> users;
    private ArrayList<Group> groups;
    
    public Group(String groupName) {
        this.groupName = groupName;
        this.users = new ArrayList<User>();
        this.groups = new ArrayList<Group>();
    
    }

    public String getGroupName() {
        return groupName;
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
        
    public void addGroup(Group group) {
        groups.add(group);
     
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    @Override
    public String toString() {
        return this.groupName;
    }
}


