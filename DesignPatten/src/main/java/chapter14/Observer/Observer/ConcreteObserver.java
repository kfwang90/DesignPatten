package chapter14.Observer.Observer;

import java.text.MessageFormat;

/**
 * 具体观察者
 * Created by alienware on 2017/5/29.
 */
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println(MessageFormat.format("观察者{0}的新状态是{1}", name, observerState));
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
