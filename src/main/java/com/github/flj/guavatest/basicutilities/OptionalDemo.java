package com.github.flj.guavatest.basicutilities;


import com.github.flj.guavatest.entity.Person;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2018/12/1     flj    ${添加描述}
 *
 * *********************************************
 * </pre>
 */

public class OptionalDemo {

    private static Logger logger = LoggerFactory.getLogger(OptionalDemo.class);
    public static void main(String[] args){
        Optional optional = Optional.of("f");
        logger.info("optional.isPresent()={}，optional.get()={}",optional.isPresent(),optional.get());


        String str1 = null;
        int str2 = 0;
        //获取两个值中不为null的值
        Serializable serializable = Objects.firstNonNull(str1, str2);
        logger.info("serializable={}",serializable);

        String s = Objects.toStringHelper(Person.class).add("name", "flj").add("sex", 2).toString();
        logger.info("s={}",s);

        int s1 = Preconditions.checkNotNull(str2,"NullPointerException");
        logger.info("s1={}",s1);

        //判断一个字段是否为null
        logger.info("str1是否为null：{}",java.util.Objects.equals(str2,null));
        logger.info("str1是否为null：{}",Objects.equal(str2,null));

        List<Integer> numbers = Lists.newArrayList(3,5,1,2);
        Ordering.natural().sortedCopy(numbers);
        logger.info("numbers={}",numbers);






    }

}
