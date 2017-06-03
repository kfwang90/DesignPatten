package chapter18.Memento;

import java.text.MessageFormat;

/**
 * 游戏角色
 * Created by alienware on 2017/6/3.
 */
public class GameRole {

    private int vit;
    private int atk;
    private int def;

    //初始状态
    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    //状态显示
    public void stateDisplay(){
        System.out.println("角色当前状态:");
        System.out.println(MessageFormat.format("体力：{0}", this.vit));
        System.out.println(MessageFormat.format("攻击力：{0}", this.atk));
        System.out.println(MessageFormat.format("防御力：{0}", this.def));
    }

    //战斗之后
    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    //保存角色状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit, atk, def);
    }

    //恢复角色状态
    public void recoveryState(RoleStateMemento memento){
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
