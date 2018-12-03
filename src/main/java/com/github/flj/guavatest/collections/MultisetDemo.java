package com.github.flj.guavatest.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset.Entry;
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
 *   v1.0       2018/12/3     flj    ${添加描述}
 *可以用两种方式看待Multiset：
 *
 * 没有元素顺序限制的ArrayList<E>
 * Map<E, Integer>，键为元素，值为计数
 *
 * Multiset继承自JDK中的Collection接口，而不是Set接口
 * *********************************************
 * </pre>
 */

public class MultisetDemo {

    private static Logger logger = LoggerFactory.getLogger(MultisetDemo.class);

    public static void main(String[] args){

        List<String> wordList = Lists.newArrayList("one","two","three","one","three","one");

        Multiset multiset = HashMultiset.create();
        multiset.addAll(wordList);
        //统计某个单词的个数
        logger.info("oneCount = {},threeCount={}",multiset.count("one"),multiset.count("three"));
        //Multiset中不重复元素的集合，类型为Set<E>
        logger.info("multiset.elementSet()={}",multiset.elementSet());



    }




}
