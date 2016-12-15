package com.violentstone.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;

/**********************************************************
 * +茫茫人海与你相遇即是一种缘分,这让我不得不好好自我介绍一下
 * +吾名 "暴力的小石头/ViolentStone",吾乃一Java程序猿
 * +吾信 "猿" 乃一世变者
 * +你见到的这个玩意儿,就是吾在 2016/12/15 创造的作品
 * ********************************************************
 * +描述:监听httpSession的监听类
 *********************************************************/
@WebListener
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("session监听开始");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session监听结束");
    }

}
