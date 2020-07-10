package com.liuchu.eshop.user.api;

import com.liuchu.eshop.user.common.beans.domain.Result;
import com.liuchu.eshop.user.common.beans.req.UserBasicInfoReq;
import com.liuchu.eshop.user.common.beans.resp.UserBasicInfoResp;

/**
 * @author liuchu
 * Date 2020/7/9
 * Time 14:43
 */
public interface UserManager {

    Result<UserBasicInfoResp> queryUserBasicInfo(UserBasicInfoReq req);
}
