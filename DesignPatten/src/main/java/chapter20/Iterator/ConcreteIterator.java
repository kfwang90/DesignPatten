package chapter20.Iterator;

/**
 * 具体迭代器类
 * Created by alienware on 2017/6/4.
 */
public class ConcreteIterator extends Iterator{

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItems(0);
    }

    @Override
    public Object next() {

        Object ret = null;
        current++;
        if (current < aggregate.count()){
            ret = aggregate.getItems(current);
        }

        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getItems(current);
    }
}
