package cn.study.mybatis;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    Integer addnew(User user);

    Integer deleteById(Integer id);

    Integer deleteByIds(List<Integer>ids);

    Integer updatePassword(String password);

    Integer updateEmailById(@Param("id") Integer id,@Param("email") String email);

    Integer count();

    User findById(Integer id);

    List<User> findAll();

    User findOld();

    UserVO findVOByid(Integer id);

}
