package chapter14.Observer.EventHandler;

/**
 * 具体通知者
 * Created by alienware on 2017/5/29.
 */
public class GoodNotifier extends Notifier{
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的同学委托尽职尽责的放哨人！");
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void nofityX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学：老师来了！");
        try{
           this.getEventHandler().notifyX();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
