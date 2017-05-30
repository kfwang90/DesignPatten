package chapter16.State;

/**
 * 具体工作类
 * Created by alienware on 2017/5/30.
 */
public class Work {

    private State current;

    public Work(){
        current = new ForennoonState();
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

    private double hour;
    private boolean finish = false;

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
