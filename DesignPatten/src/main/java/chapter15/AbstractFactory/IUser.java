package chapter15.AbstractFactory;

/**
 * 接口，解除与具体数据库访问的耦合
 * Created by alienware on 2017/5/30.
 */
public interface IUser {

    public void insert(User user);

    public User getUser(int id);
}
