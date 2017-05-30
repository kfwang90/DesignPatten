package chapter15.AbstractFactory;

/**
 * Created by alienware on 2017/5/30.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
