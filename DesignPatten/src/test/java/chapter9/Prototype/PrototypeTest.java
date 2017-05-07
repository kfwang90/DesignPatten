package chapter9.Prototype;

/**
 * Created by alienware on 2017/5/7.
 */
public class PrototypeTest {

    public static void main(String[] args) throws Exception{
        Resume a = new Resume("王小二");
        a.setPersonalInfo("男", "27");
        a.setWrokExperience("2013-2018", "xx公司");

        Resume b = (Resume)a.clone();
        b.setWrokExperience("1990-2019", "yy企业");

        Resume c = (Resume)a.clone();
        c.setPersonalInfo("女", "25");
        c.setWrokExperience("2009-2010", "zz国企");

        a.display();
        b.display();
        c.display();

        /**
         * 结果：
         * 王小二 男 27
         工作经历： 2009-2010 zz国企
         王小二 男 27
         工作经历： 2009-2010 zz国企
         王小二 女 25
         工作经历： 2009-2010 zz国企

         原因：浅复制，clone方法，如果字段是值类型的，则对该字段执行逐位复制，
              如果字段是引用类型，则复制引用但不复制引用的对象；因此，原始对象及其副本引用同一个对象；
         */

        ResumeDeep deepA = new ResumeDeep("王小二");
        deepA.setPersonalInfo("男", "27");
        deepA.setWrokExperience("2013-2018", "xx公司");

        ResumeDeep deepB = (ResumeDeep)deepA.clone();
        deepB.setWrokExperience("1990-2019", "yy企业");

        ResumeDeep deepC = (ResumeDeep)deepA.clone();
        deepC.setPersonalInfo("女", "25");
        deepC.setWrokExperience("2009-2010", "zz国企");

        deepA.display();
        deepB.display();
        deepC.display();

        /**
         * 结果：
         * 王小二 男 27
         工作经历： 2013-2018 xx公司
         王小二 男 27
         工作经历： 1990-2019 yy企业
         王小二 女 25
         工作经历： 2009-2010 zz国企

         深复制把引用对象的变量指向复制过来的新对象，而不是原有的被引用的对象
         */
    }
}
