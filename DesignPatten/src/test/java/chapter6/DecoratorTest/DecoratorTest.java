package chapter6.DecoratorTest;

import chapter6.Decorator.BigTrouser;
import chapter6.Decorator.Person;
import chapter6.Decorator.TShirts;

/**
 * Created by alienware on 2017/4/17.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        Person person = new Person("小王");

        System.out.println("第一种装扮");

        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        bigTrouser.decorate(person);
        tShirts.decorate(bigTrouser);

        tShirts.show();

    }
}
