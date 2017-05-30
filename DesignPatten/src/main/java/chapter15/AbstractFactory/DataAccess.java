package chapter15.AbstractFactory;

/**
 * 简单工厂方法
 * Created by alienware on 2017/5/30.
 */
public class DataAccess {

    //private static final String db = "Sqlserver";
    private static final String db = "Access";

    public static IUser createUser(){

        IUser result = null;

        switch (db){
            case "Sqlserver":
                result = new SqlserverUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
        }
        return result;
    }
}
