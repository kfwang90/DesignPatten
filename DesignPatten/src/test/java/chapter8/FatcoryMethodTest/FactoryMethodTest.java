package chapter8.FatcoryMethodTest;

import chapter1.SimpleFactory.Operation;
import chapter8.FatcoryMethod.AddFactory;
import chapter8.FatcoryMethod.IFactory;

/**
 * Created by alienware on 2017/4/23.
 */
public class FactoryMethodTest {

    public static void main(String[] args) throws Exception{

        IFactory operFactory = new AddFactory();
        Operation operation = operFactory.createOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
    }
}
