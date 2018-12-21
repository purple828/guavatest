package com.github.flj.guavatest.enums;

/**
 * <pre>
 * *********************************************
 * Copyright BAIBU.
 * All rights reserved.
 * Description:
 * HISTORY:
 * *********************************************
 *  Version       Date      Author      Desc
 *   v1.0      2018/9/27    fanglijuan     ${desc}
 *
 * *********************************************
 * </pre>
 */
public enum ResultStatus {

    OK("OK", 1),
    FAIL("FAIL",0),
    ERROR("ERROR", 0);

    private int value;

    private String name;


    ResultStatus(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
