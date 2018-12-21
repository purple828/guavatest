package com.github.flj.guavatest.collections;

import com.alibaba.fastjson.JSON;
import com.github.flj.guavatest.entity.Person;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2018/12/3     flj    ${添加描述}
 *Multimap是把键映射到任意多个值的一般方式。
 *
 * 可以用两种方式思考Multimap的概念：”键-单个值映射”的集合：
 *
 * a -> 1 a -> 2 a ->4 b -> 3 c -> 5
 *
 * 或者”键-值集合映射”的映射：
 *
 * a -> [1, 2, 4] b -> 3 c -> 5
 *
 * 很少会直接使用Multimap接口，更多时候你会用ListMultimap或SetMultimap接口，它们分别把键映射到List或Set。
 * *********************************************
 * </pre>
 */

public class MultiMapDemo {

    private static Logger logger = LoggerFactory.getLogger(MultiMapDemo.class);

    public static void main(String[] args){

//        Multimap multimap = HashMultimap.create();
        Multimap multimap = ArrayListMultimap.create();
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

        List<Person> personList = Lists.newArrayList(person1,person2,person3);
        for(Person person:personList){
            multimap.put(person.getSex(),person);
        }

        logger.info("multimap={}",JSON.toJSONString(multimap));
        for(Object key:multimap.keySet()){
            List<Person> pL1 = ((ArrayListMultimap) multimap).get(key);
            logger.info("key={},value={}",key,JSON.toJSONString(pL1));

        }

        HashMultimap hashMultimap = HashMultimap.create();
        hashMultimap.put(1,2);
        hashMultimap.put(2,2);
        hashMultimap.put(1,1);
        hashMultimap.put(2,1);

        hashMultimap.removeAll(1);

//        Iterator iterator = hashMultimap.entries().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, Integer> next = (Map.Entry<Integer, Integer>)iterator.next();
//            logger.info("hashMultimap key = {},value={}",next.getKey(),next.getValue());
//            if( next.getKey() == 1){
//                iterator.remove();
//            }
//        }
        logger.info("hashMultimap.size===={}",hashMultimap.size());

//        hashMultimap.remove(2,1);

        for(Object integer:hashMultimap.values()){
            logger.info("hashMultimap value ====== {}",integer);
        }

        hashMultimap.asMap();


    }

}
