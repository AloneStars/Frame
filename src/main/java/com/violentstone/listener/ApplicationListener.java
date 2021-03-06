package com.violentstone.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**********************************************************
 * +茫茫人海与你相遇即是一种缘分,这让我不得不好好自我介绍一下
 * +吾名 "暴力的小石头/ViolentStone",吾乃一Java程序猿
 * +吾信 "猿" 乃一世变者
 * +你见到的这个玩意儿,就是吾在 2016/12/15 创造的作品
 * ********************************************************
 * +描述:监听servletContext的监听类
 *********************************************************/
@WebListener
public class ApplicationListener implements javax.servlet.ServletContextListener {

    //监听web应用的启动和销毁

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("启动监听器");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("结束监听器");
    }

}
