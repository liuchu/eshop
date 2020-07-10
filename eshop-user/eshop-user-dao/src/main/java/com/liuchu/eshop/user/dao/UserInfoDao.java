package com.liuchu.eshop.user.dao;

import org.springframework.stereotype.Repository;

/**
 * @author liuchu
 * Date 2020/7/9
 * Time 17:49
 */
@Repository
public class UserInfoDao extends BaseDao{

    public void testQuery(){
        getSqlSession().insert("TestMapper.insert");
    }

}
