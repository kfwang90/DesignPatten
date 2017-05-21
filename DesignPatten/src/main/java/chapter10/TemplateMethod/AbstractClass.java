package chapter10.TemplateMethod;

/**
 * Created by alienware on 2017/5/21.
 */
public abstract  class AbstractClass {

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("结果");
    }
}
