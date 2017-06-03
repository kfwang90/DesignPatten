package chapter17.Adapter;

import java.text.MessageFormat;

/**
 * 外籍中锋
 * Created by alienware on 2017/6/3.
 */
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println(MessageFormat.format("外籍中锋{0}进攻", this.getName()));
    }

    public void 防守() {
        System.out.println(MessageFormat.format("外籍中锋{0}防守", this.getName()));
    }
}
