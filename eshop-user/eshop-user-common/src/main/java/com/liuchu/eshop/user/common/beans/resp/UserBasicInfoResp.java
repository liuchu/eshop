package com.liuchu.eshop.user.common.beans.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuchu
 * Date 2020/7/9
 * Time 16:49
 */
@Data
public class UserBasicInfoResp implements Serializable {

    private static final long serialVersionUID = -8259758187369879545L;

    private String userId;

    private String userName;

    private String phone;
}
