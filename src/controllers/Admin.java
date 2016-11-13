/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.Group;
import models.User;

/**
 *
 * @author artin
 */
public class Admin {
    private static Admin instance = null;
    private ArrayList<Group> groups;
    private ArrayList<User> users;
    
    private Admin() {
        this.groups = new ArrayList<Group>();
        this.users = new ArrayList<User>();
        this.groups.add(new Group("Root"));
    }
    
    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }
    
    public Group addGroup(String groupName, Group parent) {
        if (getGroup(groupName) == null) {
            Group newGroup = new Group(groupName);
            parent.addGroup(newGroup);
            groups.add(newGroup);
            return newGroup;
        }
        return null;
    }
    
    
    public User addUser(String userName, Group group) {
        if (getUser(userName) == null) {
            User newUser = new User(userName);
            group.addUser(newUser);
            users.add(newUser);
            return newUser;
        }
        return null;
        
    }
    
    public Group getGroup(String name) {
        for (int i = 0 ; i < groups.size() ; i++) {
            if (groups.get(i).getGroupName().equals(name)) {
                return groups.get(i);
            }
        }
        return null;
    }
    
    public User getUser(String name) {
        for (int i = 0 ; i < users.size() ; i++) {
            if (users.get(i).getUserName().equals(name)) {
                return users.get(i);
            }
        }
        return null;
    }

    public void getUsersCount() {
    }

    public double getPositiveTweetsPercentage() {
        double count = 0;
        PositiveTweetVisitor v = new PositiveTweetVisitor();
        for (User u: this.users){
            count += u.accept(v);       
        }
       if (getTotalTweets() == 0){
           return 0;
       }
       else
        return (count/getTotalTweets())*100;
    }
    public int getTotalTweets(){
        int count = 0;
        TweetCountVisitor v = new TweetCountVisitor();
        for (User u: this.users){
            count += u.accept(v);  
        }
        return count;
    }

    public int getUserCount() {
        return this.users.size();
    }

    public int getGroupCount() {
        return this.groups.size();
    }
    
    
    
    
}
