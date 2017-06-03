package chapter19.Composite;

import java.text.MessageFormat;

/**
 * 人力资源部门，具体树叶节点
 * Created by alienware on 2017/6/3.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
    }

    @Override
    public void remove(Company c) {
    }

    @Override
    public void display(int depth) {
        StringBuffer level = new StringBuffer();
        for (int i=0; i< depth; i++){
            level.append("-");
        }
        System.out.println(level.append(this.getName()));
    }

    @Override
    public void lineOfDuty() {
        System.out.println(MessageFormat.format("{0} 员工招聘培训管理", this.getName()));
    }
}
