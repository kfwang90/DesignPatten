package chapter13.BuilderTest;

import chapter13.Builder.*;

/**
 * 客户端不需要知道具体的建造过程
 * Created by alienware on 2017/5/29.
 */
public class BuilderTest {


    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }


}
