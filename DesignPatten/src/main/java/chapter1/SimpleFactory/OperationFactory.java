package chapter1.SimpleFactory;

public class OperationFactory{

    public static Operation createOperation(String opreate) throws Exception{

        Operation oper = null;
        switch (opreate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                throw new Exception("运算符错误！");
        }
        return oper;
    }
}