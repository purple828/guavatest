package com.github.flj.guavatest.service.impl;

import com.github.flj.guavatest.mapper.PersonMapper;
import com.github.flj.guavatest.mapper.StudentMapper;
import com.github.flj.guavatest.entity.Person;
import com.github.flj.guavatest.entity.Student;
import com.github.flj.guavatest.entity.common.ResponseResult;
import com.github.flj.guavatest.enums.ResultStatus;
import com.github.flj.guavatest.service.IPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class PersonServiceImpl implements IPersonService {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public ResponseResult insert(Person person){
        try{
            int res = personMapper.insert(person);
            if(1==1){
                throw new Exception("test exception");
            }
            if(res <=0){
                return new ResponseResult(ResultStatus.FAIL.getValue(),"新增失败");
            }else {
                Student student = new Student();
                student.setClassesId(1);
                student.setPersonId(1);
                studentMapper.insert(student);
                return new ResponseResult(ResultStatus.OK.getValue(),"新增成功");
            }
        }catch (Exception e){
            logger.info("func[insert] exception:",e);
            return new ResponseResult(ResultStatus.ERROR.getValue(),"新增异常");

        }
    }



}
