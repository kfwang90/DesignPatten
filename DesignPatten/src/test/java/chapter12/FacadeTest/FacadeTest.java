package chapter12.FacadeTest;

import chapter12.Facade.Facade;

/**
 * Created by alienware on 2017/5/21.
 */
public class FacadeTest {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();
    }
}
