package chapter9.Prototype;

import java.text.MessageFormat;

/**
 * Created by alienware on 2017/5/7.
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name){
        this.name = name;
        this.work = new WorkExperience();
    }

    //设置个人信息
    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWrokExperience(String workDate, String company){
        this.work.setWorkDate(workDate);
        this.work.setCompany(company);
    }

    //显示
    public void display(){
        System.out.println(MessageFormat.format("{0} {1} {2}", name, sex, age));
        System.out.println(MessageFormat.format("工作经历： {0} {1}", work.getWorkDate(), work.getCompany()));
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
