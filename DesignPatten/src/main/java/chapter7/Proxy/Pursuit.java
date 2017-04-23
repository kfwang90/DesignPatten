package chapter7.Proxy;

/**
 * 真实追求者
 * Created by alienware on 2017/4/23.
 */
public class Pursuit implements IGiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm){
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + " 送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + " 送你鲜花");
    }

    @Override
    public void giveChcolate() {
        System.out.println(mm.getName() + " 送你巧克力");
    }
}
