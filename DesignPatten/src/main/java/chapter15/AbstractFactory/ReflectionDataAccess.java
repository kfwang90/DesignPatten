package chapter15.AbstractFactory;

/**
 * 利用反射实现
 * Created by alienware on 2017/5/30.
 */
public class ReflectionDataAccess {

    private static final String packageName = "chapter15.AbstractFactory";
    private static final String db = "Access";//此处还可以用配置文件进行替换

    public static IUser createUser() throws Exception{
        String className = packageName + "." + db + "User";
        return (IUser)Class.forName(className).newInstance();
    }

}
