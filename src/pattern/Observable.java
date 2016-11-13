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
