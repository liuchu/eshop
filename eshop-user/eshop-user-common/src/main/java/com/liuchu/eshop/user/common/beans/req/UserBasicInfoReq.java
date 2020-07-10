package com.liuchu.eshop.user.common.beans.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuchu
 * Date 2020/7/9
 * Time 16:46
 */
@Data
public class UserBasicInfoReq implements Serializable {

    private static final long serialVersionUID = -3521872763004381606L;

    private String userId;
}
