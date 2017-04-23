package chapter8.FatcoryMethod;

import chapter1.SimpleFactory.Operation;

/**
 * 工厂接口
 * Created by alienware on 2017/4/23.
 */
public interface IFactory {

    public Operation createOperation();
}
