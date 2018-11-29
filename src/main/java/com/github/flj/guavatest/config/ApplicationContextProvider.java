package com.github.flj.guavatest.config;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2018/11/29     flj    设置上下文对象
 *
 * *********************************************
 * </pre>
 */
@Component
public class ApplicationContextProvider implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationContextProvider.class);
    private static ApplicationContext applicationContext ;

    /**
     * 设置上下文
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextProvider.applicationContext = applicationContext;
        System.out.println("applicationcontext init...");
    }

    /**
     * 根据类获取对象
     * @param requiredType
     * @param <T>
     * @return
     */
    public static <T>T getBean(Class<T> requiredType){
        return applicationContext.getBean(requiredType);
    }

    /**
     * 获取当前项目运行环境
     * @return
     */
    public static String getActiveProfile(){
        logger.info("getEnvironment().getActiveProfiles()---->{}",JSON.toJSONString(applicationContext.getEnvironment().getActiveProfiles()));
        return applicationContext.getEnvironment().getActiveProfiles()[0];
    }

}
