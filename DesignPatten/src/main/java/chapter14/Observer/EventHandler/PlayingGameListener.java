package chapter14.Observer.EventHandler;

import java.util.Date;

/**
 * 被通知者
 * Created by alienware on 2017/5/29.
 */
public class PlayingGameListener {

    public PlayingGameListener(){
        System.out.println("我正在玩游戏 开始时间：" + new Date());
    }

    public void stopPlayingGame(Date date){
        System.out.println("老师来了，快回到座位上，结束时间：" + date);
    }
}
