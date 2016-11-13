package controllers;

import models.Tweet;
import models.User;
import pattern.Visitable;
import pattern.Visitor;

public class PositiveTweetVisitor implements Visitor{

    @Override
    public int visit(User user) {
        int count = 0;
        String[] positiveWords = {"good", "great", "sweet", "wonderful",
                                    "fantastic", "amazing", "very nice",
                                        "nice", "dope", "awesome", "good job"};
        for (Tweet t : user.getTweets()) {
            for (int i = 0; i < positiveWords.length; i++) {
                if ((t.getText()).contains((positiveWords[i]))) {
                    count++;

                }

            }
        }
        return count;
    }
    
}
