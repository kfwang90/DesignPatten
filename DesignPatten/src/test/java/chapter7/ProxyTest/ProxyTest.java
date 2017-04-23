package chapter7.ProxyTest;

import chapter7.Proxy.Proxy;
import chapter7.Proxy.SchoolGirl;

/**
 * Created by alienware on 2017/4/23.
 */
public class ProxyTest {

    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy daili = new Proxy(jiaojiao);

        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChcolate();
    }
}
