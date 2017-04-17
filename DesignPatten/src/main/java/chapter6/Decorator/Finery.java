package chapter6.Decorator;

/**
 * 服饰类
 * Created by alienware on 2017/4/17.
 */
public class Finery extends Person{

    protected Person component;

    public void decorate(Person component){
        this.component = component;
    }


    public void show(){
        if (component != null){
            component.show();
        }
    }
}
