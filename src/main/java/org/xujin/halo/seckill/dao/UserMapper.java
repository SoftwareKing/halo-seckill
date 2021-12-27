package org.xujin.halo.seckill.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.xujin.halo.seckill.entity.UserDO;

/**
 * User数据对象
 * @author xujin
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    @Select("SELECT * FROM t_user u where u.is_deleted=0 and u.username=#{userName}")
    UserDO findUserByUserName(@Param("userName") String userName);

}

