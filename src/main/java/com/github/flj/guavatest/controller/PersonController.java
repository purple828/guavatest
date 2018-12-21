package com.github.flj.guavatest.controller;

import com.alibaba.fastjson.JSON;
import com.github.flj.guavatest.entity.Person;
import com.github.flj.guavatest.service.IPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2018/11/29     fanglijuan    ${添加描述}
 *
 * *********************************************
 * </pre>
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IPersonService personService;

    @RequestMapping("/insert")
    public void insert(Person person){
        logger.info("PersonController param----{}",JSON.toJSONString(person));
        personService.insert(person);

    }
}
