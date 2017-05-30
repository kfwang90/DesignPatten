package chapter16.State;

import java.text.MessageFormat;

/**
 * Created by alienware on 2017/5/30.
 */
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17){
            System.out.println(MessageFormat.format("当前时间:{0}点，下午工作还可以，努力", w.getHour()));
        }else{
            w.setCurrent(new EveingState());
            w.writeProgram();
        }
    }
}
