package org.xujin.halo.seckill.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xujin.halo.seckill.base.ResultData;
import org.xujin.halo.seckill.dao.UserMapper;
import org.xujin.halo.seckill.dto.UserDto;
import org.xujin.halo.seckill.service.UserService;

/**
 *  UserServiceImpl
 * @author xujin
 * @date 2021/12/27 下午10:43
 * @since
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(UserDto userDto) {
    }

    @Override
    public void updateUser(UserDto userDto) {

    }
}