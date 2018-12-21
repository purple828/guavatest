package com.github.flj.guavatest.entity.common;

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
public class ResponseResult<T> extends BaseResponse {

    private static final long serialVersionUID = 1356342534389478790L;

    private T data;

    public ResponseResult(int code, String msg) {
        super(code, msg);
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
