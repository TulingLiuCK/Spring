package com.Event;

/***
 #Create by LCK on 2022/9/5
 # 用法:事件广播器
    1、负责事件监听器的管理（注册监听器&移除监听器，将事件和监听器关联起来）
    2、负责事件的广播
 */
public interface EventMulticaster {
    /**
     * 广播事件给所有监听器，对该事件感兴趣的监听器会处理该事件
     */
    void multicastEvent(AbstractEvent event);
    /**
     * 添加事件监听器（监听器中包含了监听器能够处理的事件
     */
    void addEventListener(EventListener<?> listener);

    /**
     * 将事件监听器移除
     */
    void removeEventListener(EventListener<?> listener);
}
