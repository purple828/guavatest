package com.github.flj.guavatest.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for(int i=0;i<list.size();i=i+4){
            if(i+4>list.size()){
                System.out.println(list.subList(i, list.size()));
            }else {
                System.out.println(list.subList(i, i+4));
            }

        }

        String sellerNoName = "爱强布业(BS1786ocoIwy)";
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(sellerNoName);
        if(m.find()){
            logger.info("1111111111111111111111111");
            m.group();
            logger.info("m.group()====={}",m.group());
        }else {
            logger.info("322222222222222222222222");
        }


//        String sellerNo = p.matcher(sellerNoName).group();
//        logger.info("----------sellerNo=---{}",sellerNo);

//        StringBuilder codeUrlSb = new StringBuilder();
//
//        BigDecimal bigDecimal = new BigDecimal(2.3);
//        bigDecimal.add(new BigDecimal(12));
//        System.out.println("aaaaaaaaaaaaaaa:"+bigDecimal);
//
//        long time = 1548468600000L;



        BigDecimal waitPayMoney = new BigDecimal(623.300).subtract(new BigDecimal(623.300));
        int compare = waitPayMoney.compareTo(BigDecimal.ZERO);
        if(compare == 0){
            System.out.println("------------------------想等");
        }




    }




}
