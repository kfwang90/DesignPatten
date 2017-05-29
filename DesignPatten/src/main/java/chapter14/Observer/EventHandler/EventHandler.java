package chapter14.Observer.EventHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * 委托类
 * Created by alienware on 2017/5/29.
 */
public class EventHandler {

    private List<Event> objects;

    public EventHandler(){
        this.objects = new ArrayList<Event>();
    }

    //添加某个对象要执行的事件，及需要的参数
    public void addEvent(Object object, String methodName, Object ...args){
        objects.add(new Event(object, methodName, args));
    }

    //通知所有的对象执行指定的事件
    public void notifyX() throws Exception{
        for (Event e : objects){
            e.invoke();
        }
    }

}
