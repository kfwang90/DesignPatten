package chapter7.Proxy;

/**
 * 代理类
 * Created by alienware on 2017/4/23.
 */
public class Proxy implements IGiveGift {

    private Pursuit gg;

    public Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChcolate() {
        gg.giveChcolate();
    }
}
