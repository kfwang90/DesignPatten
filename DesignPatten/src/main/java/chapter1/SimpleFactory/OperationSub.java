package chapter1.SimpleFactory;

/**
 * Created by alienware on 2017/4/16.
 */
public class OperationSub extends Operation {

    @Override
    public double getResult(){
        double result = 0;
        result = this.getNumberA() - this.getNumberB();
        return result;
    }
}
