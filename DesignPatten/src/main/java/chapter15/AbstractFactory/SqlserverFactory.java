package chapter15.AbstractFactory;

/**
 * Created by alienware on 2017/5/30.
 */
public class SqlserverFactory implements IFactory {
    @Override
    public IUser createUser() {

        return new SqlserverUser();
    }
}
