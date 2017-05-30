package chapter15.AbstractFactoryTest;

import chapter15.AbstractFactory.*;

/**
 * Created by alienware on 2017/5/30.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) throws Exception{

        /**
         * 抽象工厂模式，缺点：每增加一张表，都需要创建很多类
         */
        User user = new User();

        IFactory factory = new SqlserverFactory();

        IUser iUser = factory.createUser();//解除与具体数据库访问的依赖

        iUser.insert(user);
        iUser.getUser(1);


        /**
         * 抽象工厂模式+简单工厂模式
         * 抛弃IFactory,SqlserverFactroy和AccessFactory，用简单工厂DataAccess代替
         * 客户端没有出现任何一个Sqlserver和Access的字样，达到了解耦的目的。
         */
        iUser = DataAccess.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        /**
         * 反射+抽象工厂+简单工厂
         * 利用反射获得具体工厂类
         */
        iUser = ReflectionDataAccess.createUser();
        iUser.insert(user);
        iUser.getUser(1);

    }
}
