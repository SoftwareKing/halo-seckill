package org.xujin.halo.seckill.dto;


import lombok.Data;

/**
 * 增加用户
 * @author xujin
 */
@Data
public class UserDto {

    private String userName;

    private String role;

    private String name;

    private String email;

    private String password;

    private byte status;
}
