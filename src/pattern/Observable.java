/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.ArrayList;

public class Observable {
    
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAll(Object object){
        for (Observer o:observers){ 
            o.update(object);
        }
    }
}
