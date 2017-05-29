package chapter14.Observer.EventHandler;

import java.util.Date;

/**
 * 被通知者
 * Created by alienware on 2017/5/29.
 */
public class WatchingTVListener {

        public WatchingTVListener(){
            System.out.println("我正在看电视 开始时间：" + new Date());
        }

        public void stopWatchingTV(Date date){
            System.out.println("老师来了，快关闭电视，结束时间：" + date);
        }
}
