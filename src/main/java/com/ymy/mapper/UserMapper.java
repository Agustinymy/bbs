package com.ymy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ymy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "userMapper")
@Mapper
public interface UserMapper extends BaseMapper<User> {

   /* @Select("select * from user")
     List<User> findUser();*/
}
