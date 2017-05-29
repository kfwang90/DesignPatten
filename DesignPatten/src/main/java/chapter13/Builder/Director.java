package chapter13.Builder;

/**
 * 指挥者类
 * Created by alienware on 2017/5/29.
 */
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
