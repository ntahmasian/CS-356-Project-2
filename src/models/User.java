package models;

import java.util.ArrayList;
import pattern.Observer;
import pattern.Observable;
import pattern.Visitable;
import pattern.Visitor;

public class User extends Observable implements Visitable{
    private String userName;
    private ArrayList<User> followers;
    private ArrayList<User> following;
    private ArrayList<Tweet> tweets;

    public User(String userName) {
        this.userName = userName;
        this.followers = new ArrayList<User>();
        this.following = new ArrayList<User>();
        this.tweets = new ArrayList<Tweet>();
    }
        
    public String getUserName() {
        return userName;
    }
      

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    public ArrayList<User> getFollowing() {
        return following;
    }

    public void setFollowing(ArrayList<User> following) {
        this.following = following;
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }
    
    public void addFollowing(User user) {
        this.following.add(user);
    }
    
    public void addFollower(User user) {
        this.followers.add(user);
    }
    
    public Tweet addTweet(String tweetText) {
        Tweet newTweet = new Tweet(userName + "--->" + tweetText);
        this.tweets.add(newTweet);
       
        notifyAll(newTweet);
        return newTweet;
    }
    
    @Override
    public String toString() {
        return this.userName;
    }

    @Override
    public int accept(Visitor visitor) {
        
        return visitor.visit(this);

    }
    
}