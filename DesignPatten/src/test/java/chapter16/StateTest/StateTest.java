package chapter16.StateTest;

import chapter16.State.Work;

/**
 * Created by alienware on 2017/5/30.
 */
public class StateTest {

    public static void main(String[] args) {

        Work work = new Work();

        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

        work.setHour(21);
        work.setFinish(true);
        work.writeProgram();
    }
}
