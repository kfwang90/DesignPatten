package chapter16.State;

import java.text.MessageFormat;

/**
 * 上午工作状态
 * Created by alienware on 2017/5/30.
 */
public class ForennoonState extends State {

    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12){
            System.out.println(MessageFormat.format("当前时间:{0}点，上午工作，精神百倍", w.getHour()));
        }else{
            w.setCurrent(new NoonState());
            w.writeProgram();
        }
    }
}
