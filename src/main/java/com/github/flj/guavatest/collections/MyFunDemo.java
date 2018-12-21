package com.github.flj.guavatest.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description: ${添加描述}
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2018/12/21     flj    ${添加描述}
 *
 * *********************************************
 * </pre>
 */

public class MyFunDemo {

    private static Logger logger = LoggerFactory.getLogger(MyFunDemo.class);


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int count = 3;
        String str = "";
        try{
            while (flag){
                str = scanner.next();
                if(str.substring(0,1).equals("那")){
                    str = str.substring(1);
                }
                str = str.replaceAll("你","111");
                str = str.replaceAll("我","222");
                str = str.replaceAll("111","我");
                str = str.replaceAll("222","你");
                str = str.replaceAll("[吗，么]","");
                str = str.replace("？","！");
                str = str.replace("?","!");
                str = str.replaceAll("['蟹蟹','谢谢']","不客气");
                System.out.println(str);
                count--;
                if(count <= 0){
                    flag = false;
                    System.out.println("事不过三，不想跟你说话了！");
                }
            }

        }catch (Exception e){
            logger.error("my fun exception !",e);
        }



    }

}
