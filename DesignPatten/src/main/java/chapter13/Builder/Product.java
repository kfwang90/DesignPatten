package chapter13.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体产品类
 * Created by alienware on 2017/5/29.
 */
public class Product {

    List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品创建-----");
        for (String part :  parts){
            System.out.println(part);
        }
    }
}
