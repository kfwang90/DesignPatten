package chapter14.Observer.EventHandler;

/**
 * 抽象通知者
 * Created by alienware on 2017/5/29.
 */
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    //增加需要放哨的同学
    public abstract void addListener(Object object, String methodName, Object ...args);
    //告诉所有需要帮忙放哨的同学，老师来了
    public abstract void nofityX();
}
