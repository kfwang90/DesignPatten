package chapter19.Composite;

/**
 * 抽象公司类
 * Created by alienware on 2017/6/3.
 */
public abstract class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
    public abstract void lineOfDuty();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
