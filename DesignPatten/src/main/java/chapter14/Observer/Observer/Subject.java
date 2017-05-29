package chapter14.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知者
 * Created by alienware on 2017/5/29.
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    //增加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //移除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void notifyObserver(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
