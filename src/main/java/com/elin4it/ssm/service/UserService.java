package com.elin4it.ssm.service;

import com.elin4it.ssm.pojo.User;

import java.util.List;

/**
 * Created by �� on 2015/7/11. 
 */
public interface UserService {

    /**
     * ���������û� 
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
}  