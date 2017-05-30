package chapter16.State;

import java.text.MessageFormat;

/**
 * Created by alienware on 2017/5/30.
 */
public class EveingState extends State {

    @Override
    public void writeProgram(Work w) {

        if (w.isFinish()){
            w.setCurrent(new RestState());
            w.writeProgram();
        }else {
            if (w.getHour() < 21) {
                System.out.println(MessageFormat.format("当前时间:{0}点，加班工作，疲惫", w.getHour()));
            } else {
                w.setCurrent(new SleepingState());
                w.writeProgram();
            }
        }

    }
}
