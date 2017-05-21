package chapter10.TemplateMethod;

/**
 * Created by alienware on 2017/5/21.
 */
public class ConcreteClassA extends AbstractClass{

    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A的方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A的方法2实现");

    }
}
