package chapter9.Prototype;

/**
 * Created by alienware on 2017/5/7.
 */
public class WordExperienceDeep implements Cloneable {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
