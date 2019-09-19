package com.fred.sboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class myListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextevent启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("cocntextevent销毁");
    }
}
