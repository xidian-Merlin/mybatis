package com.elin4it.ssm.servicelmpl;

import com.elin4it.ssm.dao.UserMapper;
import com.elin4it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.elin4it.ssm.pojo.User;


/**
 * Created by tongho on 2017/4/11.
 */
@Service("userSercice")
public class UserServicelmpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public  User getUserById(int id) { return userMapper.selectByPrimaryKey(id); }

    public User findUserByLoginName(String username) {
        System.out.println("findUserByLoginName call!");
        return userMapper.findUserByLoginName(username);

    }
}
