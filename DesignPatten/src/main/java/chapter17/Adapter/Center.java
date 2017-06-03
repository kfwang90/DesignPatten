package chapter17.Adapter;

import java.text.MessageFormat;

/**
 * 中锋
 * Created by alienware on 2017/6/3.
 */
public class Center extends Player{

    public Center(String name){
        this.setName(name);
    }

    @Override
    public void attack() {
        System.out.println(MessageFormat.format("中锋{0}进攻", this.getName()));
    }

    @Override
    public void defense() {
        System.out.println(MessageFormat.format("中锋{0}防守", this.getName()));
    }
}
