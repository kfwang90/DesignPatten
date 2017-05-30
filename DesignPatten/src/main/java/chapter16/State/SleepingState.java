package chapter16.State;

import java.text.MessageFormat;

/**
 * Created by alienware on 2017/5/30.
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println(MessageFormat.format("当前时间:{0}点，不行了，睡着了。", w.getHour()));
    }
}
