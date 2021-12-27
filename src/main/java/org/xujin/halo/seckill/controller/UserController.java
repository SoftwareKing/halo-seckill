package org.xujin.halo.seckill.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xujin.halo.seckill.base.ResultData;
import org.xujin.halo.seckill.dto.UserDto;
import org.xujin.halo.seckill.service.UserService;


/**
 * Desc:
 * @author xujin
 * @date 2019/7/17 17:51
 **/
@RestController
@RequestMapping("/admin/user")
@Api("用户管理")
public class UserController {

    @Autowired
    protected UserService userService;

    @PostMapping("/add")
    @ApiOperation(value = "增加用户")
    public ResultData addUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
        return ResultData.success();
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新用户")
    public ResultData<Void> updateUser(@RequestBody UserDto userDto) {
        userService.updateUser(userDto);
        return ResultData.success();
    }

}
