package chapter2.Strategy;

/**
 * 具体算法A
 * Created by alienware on 2017/4/16.
 */
public class ConcreteStrategyA extends  Strategy {

    @Override
    public void algorithmInterface() {
        //具体实现
        System.out.println("算法A实现");
    }
}
