package com.Event;

/***
 #Create by LCK on 2022/9/5
 # 用法: 事件对象
 */
public abstract class AbstractEvent {
    //事件源
    protected Object source;

    public AbstractEvent(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
