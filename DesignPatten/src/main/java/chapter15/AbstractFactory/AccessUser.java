package chapter15.AbstractFactory;

/**
 * Created by alienware on 2017/5/30.
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access中增加一条User记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据ID得到User表一条记录");
        return null;
    }
}
