package com.github.flj.guavatest.service.impl;

import com.github.flj.guavatest.mapper.StudentMapper;
import com.github.flj.guavatest.entity.Student;
import com.github.flj.guavatest.entity.common.ResponseResult;
import com.github.flj.guavatest.enums.ResultStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class StudentServiceImpl {

    @Autowired
    private StudentMapper studentMapper;

    public ResponseResult insert(Student student){
        int res = studentMapper.insert(student);
        if(res <=0){
            return new ResponseResult(ResultStatus.FAIL.getValue(),"新增失败");
        }else {
            return new ResponseResult(ResultStatus.OK.getValue(),"新增成功");
        }

    }


}
