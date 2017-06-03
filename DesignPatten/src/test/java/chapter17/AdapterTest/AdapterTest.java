package chapter17.AdapterTest;

import chapter17.Adapter.*;

/**
 * Created by alienware on 2017/6/3.
 */
public class AdapterTest {

    public static void main(String[] args) {
        //普通方式
        Player b = new Forwards("巴提尔");
        b.attack();
        Player m = new Guards("麦克");
        m.attack();

        Player ym = new Center("姚明");
        ym.attack();
        ym.defense();

        //适配器模式
        Player ym2 = new Translator("姚明");
        ym2.attack();
        ym2.defense();
    }
}
