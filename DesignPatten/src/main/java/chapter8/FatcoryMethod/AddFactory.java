package chapter8.FatcoryMethod;

import chapter1.SimpleFactory.Operation;
import chapter1.SimpleFactory.OperationAdd;

/**
 * Created by alienware on 2017/4/23.
 */
public class AddFactory implements IFactory{
    @Override
    public Operation createOperation() {

        return new OperationAdd();
    }
}
