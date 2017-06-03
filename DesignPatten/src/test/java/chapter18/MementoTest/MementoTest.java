package chapter18.MementoTest;

import chapter18.Memento.GameRole;
import chapter18.Memento.RoleStateCaretaker;

/**
 * Created by alienware on 2017/6/3.
 */
public class MementoTest {

    public static void main(String[] args) {
        GameRole wangxiaoming = new GameRole();
        wangxiaoming.initState();
        wangxiaoming.stateDisplay();
        System.out.println("战斗之前保存进度");
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(wangxiaoming.saveState());
        System.out.println("开始战斗，战斗之后情况");
        wangxiaoming.fight();
        wangxiaoming.stateDisplay();
        System.out.println("恢复战斗前进度，恢复之后情况");
        //恢复状态
        wangxiaoming.recoveryState(stateAdmin.getMemento());
        wangxiaoming.stateDisplay();
    }
}
