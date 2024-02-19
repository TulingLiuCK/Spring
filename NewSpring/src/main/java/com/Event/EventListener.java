package com.Event;

/***
 #Create by LCK on 2022/9/5
 # 用法:事件监听器
 <E> 当前监听器感兴趣的事件类型
 */
public interface EventListener<E extends AbstractEvent> {

    /**
     * 此方法负责处理事件
     */
    void onEvent(E event);
}
