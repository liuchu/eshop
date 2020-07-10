package com.liuchu.eshop.user.common.beans.domain;

import com.liuchu.eshop.user.common.enums.StatusEnum;

/**
 * @author liuchu
 * Date 2020/7/9
 * Time 16:28
 */
public class Result<T> {

    private StatusEnum status;

    private T data;

    private String errorCode;

    private String errorMsg;
}
