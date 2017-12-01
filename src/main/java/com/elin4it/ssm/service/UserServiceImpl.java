package com.elin4it.ssm.service;

import com.elin4it.ssm.mapper.UserMapper;
import com.elin4it.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by �� on 2015/7/11. 
 */
@Service
public class UserServiceImpl implements UserService {

    //User�ӿ�  
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        //����mapper���е�selectByExample�����������������Ϊnull�����ʾ����������  
        List<User> users = userMapper.selectByExample(null);

        return users;
    }
}  