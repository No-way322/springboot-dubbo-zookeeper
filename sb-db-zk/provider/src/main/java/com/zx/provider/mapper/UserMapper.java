package com.zx.provider.mapper;

import com.zx.common.domin.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author Noway
 * @Date 2020/5/8 16:51
 * @Version 1.0
 * @Declare .....
 */
@Mapper
public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "sex", property = "sex")})
    @Select("SELECT * FROM u_user")
    List<User> getAll();

    @Select("SELECT * FROM u_user t WHERE t.id = #{id}")
    @ResultMap("userMap")
    User getOne(Long id);
}
