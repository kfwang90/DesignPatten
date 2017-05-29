package chapter14.ObserverTest;

import chapter14.Observer.Observer.ConcreteObserver;
import chapter14.Observer.Observer.ConcreteSubject;

/**
 * Created by alienware on 2017/5/29.
 */
public class ObserverTest {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver(subject, "X"));
        subject.attach(new ConcreteObserver(subject, "Y"));
        subject.attach(new ConcreteObserver(subject, "Z"));

        subject.setSubjectState("ABC");
        subject.notifyObserver();


    }

}
