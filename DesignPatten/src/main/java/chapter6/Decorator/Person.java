package chapter6.Decorator;

import java.text.MessageFormat;

/**
 * Created by alienware on 2017/4/17.
 */
public class Person {

    public Person(){

    }

    private String name;
    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(MessageFormat.format("装扮的{0}", name));
    }
}
