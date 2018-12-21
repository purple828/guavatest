package com.github.flj.guavatest.entity.common;

import java.io.Serializable;

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
public class BaseResponse implements Serializable {

    private static final long serialVersionUID = 2798269472596010266L;

    /**
     * 状态码
     */
    private int code;

    /**
     * 提示语
     */
    private String msg;

    public BaseResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
