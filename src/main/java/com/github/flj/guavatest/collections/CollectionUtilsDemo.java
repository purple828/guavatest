package com.github.flj.guavatest.collections;

import com.alibaba.fastjson.JSON;
import com.github.flj.guavatest.data.MakeTestData;
import com.github.flj.guavatest.entity.Person;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
 *   v1.0       2018/12/5     flj    ${添加描述}
 *
 * *********************************************
 * </pre>
 */

public class CollectionUtilsDemo {

    private static Logger logger = LoggerFactory.getLogger(CollectionUtilsDemo.class);

    public static void main(String[] args){

        listsUtil();


    }


    public static void listsUtil(){
        //只支持int、Integer类型来构建list
        List intsList = Ints.asList(1,2,3,4,5);
        logger.info("intsList.size() = {}",JSON.toJSONString(intsList));

        //reverse不改变原始集合
        List reverseList = Lists.reverse(intsList);
        logger.info("intsList = {}",JSON.toJSONString(intsList));//[1,2,3,4,5]
        logger.info("reverseList = {}",JSON.toJSONString(reverseList));//[5,4,3,2,1]

        //partition 把List按指定大小分割
        List partition = Lists.partition(intsList, 3);
        logger.info("partition = {}",JSON.toJSONString(partition));//[[1,2,3],[4,5]]

        List<Person> personList = MakeTestData.getPersonData();

        //transform将一个集合转换为另一个集合
        List<String> names = Lists.transform(personList, new Function<Person, String>() {
            @Override
            public String apply(Person input) {
                return input.getName();
            }
        });
        List<Integer> ages = Lists.transform(personList,(Person person)->person.getAge());
        logger.info("names---{},ages---{}",JSON.toJSONString(names),JSON.toJSONString(ages));





    }


}
