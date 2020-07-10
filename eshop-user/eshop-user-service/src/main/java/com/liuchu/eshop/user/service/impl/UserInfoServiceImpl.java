package com.liuchu.eshop.user.service.impl;

import com.liuchu.eshop.user.dao.UserInfoDao;
import com.liuchu.eshop.user.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author liuchu
 * Date 2020/7/9
 * Time 17:55
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoDao userInfoDao;

    public UserInfoServiceImpl(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }

    @Override
    public void testService() {
        userInfoDao.testQuery();
    }
}
