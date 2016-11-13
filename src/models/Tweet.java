/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author artin
 */
public class Tweet implements Comparable<Tweet>{
    private Date date;
    private String text;

    public Tweet(String text) {
        this.date = new Date();
        this.text = text;
    }
    
    

    public Date getDate() {
        return date;
    }


    public String getText() {
        return text;
    }
    
    @Override
    public String toString() {
        return this.text;
    }

    @Override
    public int compareTo(Tweet o) {
        return o.date.compareTo(this.date);
    }

    
    
}
