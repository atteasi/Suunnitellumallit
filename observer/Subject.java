package observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    Set<Observer> observers = new HashSet();
    
    public void attach(Observer o){
        observers.add(o);
    }

    public void detach(Observer o){
        observers.remove(o);
    }

    public void notifyTimer(){
        for (Observer o: observers){
            o.update(this);
        }
    }
}