package chapter2.Strategy;

/**
 * 上下文
 * Created by alienware on 2017/4/16.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public Context(String type) throws Exception{

        switch (type){

            case "A":
                this.strategy = new ConcreteStrategyA();
                break;
            case "B":
                this.strategy = new ConcreteStrategyB();
                break;
            case "C":
                this.strategy = new ConcreteStrategyC();
                break;
            default:
                throw new Exception("类型错误。");

        }
    }

    //上下文接口
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
