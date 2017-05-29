package chapter13.Builder;

/**
 * 抽象建造者类
 * Created by alienware on 2017/5/29.
 */
public abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
