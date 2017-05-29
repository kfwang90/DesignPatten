package chapter13.Builder;

/**
 * 具体建造者类
 * Created by alienware on 2017/5/29.
 */
public class ConcreteBuilder2 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
