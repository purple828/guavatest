package com.github.flj.guavatest.service;

import com.github.flj.guavatest.entity.Person;
import com.github.flj.guavatest.entity.common.ResponseResult;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2018/12/7     flj    ${添加描述}
 *
 * *********************************************
 * </pre>
 */

public interface IPersonService {

    ResponseResult insert(Person person);
}
