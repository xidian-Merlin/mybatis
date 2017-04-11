package com.elin4it.ssm.service;

import com.elin4it.ssm.pojo.User;

/**
 * Created by tongho on 2017/4/11.
 */
public interface UserService {
    public User getUserById(int id);

    public User findUserByLoginName(String username);
}
