package chapter14.Observer.EventHandler;

import java.lang.reflect.Method;

/**
 * Created by alienware on 2017/5/29.
 */
public class Event {

    //要执行的方法
    private Object object;
    //要执行的方法名称
    private String methodName;
    //要执行的方法的参数
    private Object[] params;
    //要执行的方法的类型
    private Class[] paramTypes;

    public Event(){

    }

    public Event(Object object, String methodName, Object ...args){
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params){
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++){
            this.paramTypes[i] = params[i].getClass();
        }
    }

    //执行该对象的方法
    public void invoke() throws Exception{
        Method method = object.getClass().getMethod(this.getMethodName(), this.getParamTypes());
        if (null == method){
            return;
        }
        method.invoke(this.getObject(), this.getParams());
    }


    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }
}
