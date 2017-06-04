package chapter20.IteratorTest;

import chapter20.Iterator.ConcreteAggregate;
import chapter20.Iterator.ConcreteIterator;
import chapter20.Iterator.Iterator;

import java.text.MessageFormat;

/**
 * Created by alienware on 2017/6/4.
 */
public class IteratorTest {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.setItems(0, "大鸟");
        aggregate.setItems(1, "小菜");
        aggregate.setItems(2, "行李");
        aggregate.setItems(3, "老外");
        aggregate.setItems(4, "公交内部员工");
        aggregate.setItems(5, "小偷");

        Iterator iterator = new ConcreteIterator(aggregate);
        Object item = iterator.first();

        while (!iterator.isDone()){
            System.out.println(MessageFormat.format("{0}请买车票!", iterator.currentItem()));
            iterator.next();
        }
    }
}
