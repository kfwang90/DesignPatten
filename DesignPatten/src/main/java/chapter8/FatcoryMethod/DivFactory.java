package chapter8.FatcoryMethod;

import chapter1.SimpleFactory.Operation;
import chapter1.SimpleFactory.OperationDiv;

/**
 * Created by alienware on 2017/4/23.
 */
public class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
