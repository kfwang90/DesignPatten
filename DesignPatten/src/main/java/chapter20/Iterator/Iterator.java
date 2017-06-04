package chapter20.Iterator;

/**
 * 抽象迭代器类
 * Created by alienware on 2017/6/4.
 */
public abstract class Iterator {

    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();

}
