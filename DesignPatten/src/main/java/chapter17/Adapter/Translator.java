package chapter17.Adapter;

/**
 * 翻译者，适配器
 * Created by alienware on 2017/6/3.
 */
public class Translator extends Player {

    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name){
        this.setName(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.进攻();
    }

    @Override
    public void defense() {
        wjzf.防守();
    }
}
