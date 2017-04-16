package chapter2.StrategyTest;

import chapter2.Strategy.ConcreteStrategyA;
import chapter2.Strategy.ConcreteStrategyB;
import chapter2.Strategy.ConcreteStrategyC;
import chapter2.Strategy.Context;

/**
 * 策略模式单元测试
 * Created by alienware on 2017/4/16.
 */
public class StrategyTest {

    public static void main(String[] args) throws Exception{

        Context context = null;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();

        context = new Context("A");
        context.contextInterface();

    }
}
