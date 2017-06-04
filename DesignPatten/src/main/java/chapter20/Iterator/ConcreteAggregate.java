package chapter20.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类
 * Created by alienware on 2017/6/4.
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return this.items.size();
    }

    public Object getItems(int index) {
        return items.get(index);
    }

    public void setItems(int index, String value) {
        this.items.add(index, value);
    }
}
