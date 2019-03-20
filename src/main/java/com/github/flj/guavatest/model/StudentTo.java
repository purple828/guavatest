package com.github.flj.guavatest.model;

import com.alibaba.fastjson.JSON;

/**
 * <pre>
 * ****************************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description:builder模式
 * HISTORY:
 * ***************************************************
 *  Version      Date       Author       Desc
 *   v1.0       2019/3/19     flj    ${添加描述}
 *
 * *********************************************
 * </pre>
 */

public class StudentTo {

    private Integer id;

    private Integer classesId;

    private Integer personId;

    public static class Builder{

        private Integer id;

        private Integer classesId;

        private Integer personId;

        public Builder(){

        }

        public Builder classesId(Integer val){
            classesId = val;
            return this;
        }
        public Builder personId(Integer val){
            personId = val;
            return this;
        }

        public StudentTo build(){
            return new StudentTo(this);
        }


    }

    private StudentTo(Builder builder){
        classesId = builder.classesId;
        personId = builder.personId;
    }

    @Override
    public String toString(){
        return "StudentTo={" + "\n" +
                "classesId=" + classesId + "\n" +
                "personId=" + personId + "\n" +
                "}";


    }



    public static void main(String[] args){
        StudentTo studentTo = new StudentTo.Builder().classesId(1).personId(2).build();

        System.out.println("---------studentTo="+JSON.toJSONString(studentTo));
        System.out.println("---------studentTo*********="+studentTo.toString());
        System.out.println("---------classesId="+studentTo.classesId);
        System.out.println("---------personId="+studentTo.personId);


    }

}
