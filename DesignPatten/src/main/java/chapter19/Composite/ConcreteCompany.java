package chapter19.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体子公司类，树枝节点
 * Created by alienware on 2017/6/3.
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuffer level = new StringBuffer();
        for (int i=0; i< depth; i++){
            level.append("-");
        }
        System.out.println(level.append(this.getName()));
        for (Company company: children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company: children) {
            company.lineOfDuty();
        }
    }
}
