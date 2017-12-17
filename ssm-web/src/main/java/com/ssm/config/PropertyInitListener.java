package com.ssm.config;


import com.ssm.integration.PropertyInitConfig;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * 初始化系统配置
 *
 * @author 莫小阳
 */
@Slf4j
public class PropertyInitListener implements ServletContextListener {

    /**
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("call 初始化阿波罗配置信息开始···");
        PropertyInitConfig.webInitProperties();
        log.info("call 初始化阿波罗配置信息结束···");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        throw new UnsupportedOperationException();
    }
}
