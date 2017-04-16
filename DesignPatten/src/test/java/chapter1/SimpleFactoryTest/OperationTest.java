package chapter1.SimpleFactoryTest;

import chapter1.SimpleFactory.Operation;
import chapter1.SimpleFactory.OperationFactory;

/**
 * 单元测试
 * Created by alienware on 2017/4/16.
 */
public class OperationTest {

    public static void main(String[] args) throws Exception{
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setNumberA(1);
        operationAdd.setNumberB(2);

        System.out.println(operationAdd.getResult());

        Operation operationMul = OperationFactory.createOperation("/");
        operationMul.setNumberA(1);
        operationMul.setNumberB(1);

        System.out.println(operationMul.getResult());
    }
}
