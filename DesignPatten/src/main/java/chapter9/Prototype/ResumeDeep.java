package chapter9.Prototype;

import java.text.MessageFormat;

/**
 * Created by alienware on 2017/5/7.
 */
public class ResumeDeep implements Cloneable{

    private String name;
    private String sex;
    private String age;

    private WordExperienceDeep work;

    public ResumeDeep(String name){
        this.name = name;
        this.work = new WordExperienceDeep();
    }

    /**
     * 提供Clone方法调用的私有构造函数，以便克隆"工作经历"的数据
      * @param wordExperienceDeep
     * @throws CloneNotSupportedException
     */
    private ResumeDeep(WordExperienceDeep wordExperienceDeep) throws CloneNotSupportedException{
        this.work = (WordExperienceDeep)wordExperienceDeep.clone();
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

    /**
     * 调用私有的构造方法，让"工作经历"克隆完成，然后再给这个
     * 简历对象的相关字段赋值，最终返回一个深复制的简历对象
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException{
        ResumeDeep obj = new ResumeDeep(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
