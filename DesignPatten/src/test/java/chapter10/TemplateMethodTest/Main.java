package chapter10.TemplateMethodTest;

import chapter10.TemplateMethod.AbstractClass;
import chapter10.TemplateMethod.ConcreteClassA;
import chapter10.TemplateMethod.ConcrtetClassB;

/**
 * Created by alienware on 2017/5/21.
 */
public class Main {

    public static void main(String[] args) {
        AbstractClass c;

        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcrtetClassB();
        c.templateMethod();


    }
}
