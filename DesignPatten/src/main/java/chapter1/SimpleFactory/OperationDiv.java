package chapter1.SimpleFactory;

/**
 * Created by alienware on 2017/4/16.
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() throws Exception {
        double result = 0;
        if (this.getNumberB() == 0)
            throw new Exception("除数不能为零。");
        result = this.getNumberA() / this.getNumberB();
        return result;
    }
}
