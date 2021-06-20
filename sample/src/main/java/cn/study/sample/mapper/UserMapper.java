package cn.study.sample.mapper;

import cn.study.sample.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;


public interface UserMapper {
    Integer insert(User user);

    User findByUsername(String name);
}
