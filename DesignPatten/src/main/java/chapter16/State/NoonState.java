package chapter16.State;

import java.text.MessageFormat;

/**
 * Created by alienware on 2017/5/30.
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13){
            System.out.println(MessageFormat.format("当前时间:{0}点，饿了。需要午休。", w.getHour()));
        }else{
            w.setCurrent(new AfternoonState());
            w.writeProgram();
        }
    }
}
