package chapter17.Adapter;

import java.text.MessageFormat;

/**
 * 后卫
 * Created by alienware on 2017/6/3.
 */
public class Guards extends Player{

    public Guards(String name){
        this.setName(name);
    }

    @Override
    public void attack() {
        System.out.println(MessageFormat.format("后卫{0}进攻", this.getName()));
    }

    @Override
    public void defense() {
        System.out.println(MessageFormat.format("后卫{0}防守", this.getName()));
    }
}
