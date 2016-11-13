package controllers;

import models.Tweet;
import models.User;
import pattern.Visitor;

public class TweetCountVisitor implements Visitor {

    @Override
    public int visit(User user) {
        return user.getTweets().size();
    }   
}
