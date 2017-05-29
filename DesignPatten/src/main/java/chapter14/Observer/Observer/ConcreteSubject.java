package chapter14.Observer.Observer;

/**
 * 具体通知者
 * Created by alienware on 2017/5/29.
 */
public class ConcreteSubject extends Subject {

    //具体被观察者状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }


}
