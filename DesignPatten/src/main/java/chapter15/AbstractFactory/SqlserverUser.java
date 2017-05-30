package chapter15.AbstractFactory;

/**
 * 具体实现类
 * Created by alienware on 2017/5/30.
 */
public class SqlserverUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在SQL SERVER中增加一条User记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQL SERVER中根据ID得到User表一条记录");
        return null;
    }
}
