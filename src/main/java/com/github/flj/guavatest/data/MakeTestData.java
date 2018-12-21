package com.github.flj.guavatest.data;

import com.github.flj.guavatest.entity.Person;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

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

public class MakeTestData {

    public static List<Person> getPersonData(){
        List<Person> personList = Lists.newArrayList();
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(18);
        person1.setSex(1);

        Person person2 = new Person();
        person2.setName("李四");
        person2.setAge(18);
        person2.setSex(2);

        Person person3 = new Person();
        person3.setName("王小二");
        person3.setAge(20);
        person3.setSex(1);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        return personList;


    }

}
