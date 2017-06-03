package chapter17.Adapter;

import java.text.MessageFormat;

/**
 * 前锋
 * Created by alienware on 2017/6/3.
 */
public class Forwards extends Player{

    public Forwards(String name){
        this.setName(name);
    }

    @Override
    public void attack() {
        System.out.println(MessageFormat.format("前锋{0}进攻", this.getName()));
    }

    @Override
    public void defense() {
        System.out.println(MessageFormat.format("前锋{0}防守", this.getName()));
    }
}
