package chapter18.Memento;

/**
 * 角色状态管理员
 * Created by alienware on 2017/6/3.
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
