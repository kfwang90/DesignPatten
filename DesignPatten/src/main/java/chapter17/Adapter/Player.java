package chapter17.Adapter;

/**
 * 球员抽象类
 * Created by alienware on 2017/6/3.
 */
public abstract class Player {

    private String name;

    public abstract void attack();

    public abstract void defense();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
