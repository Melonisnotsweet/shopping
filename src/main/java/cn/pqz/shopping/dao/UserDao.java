package cn.pqz.shopping.dao;

import cn.pqz.shopping.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    public Integer addUser(User user);
    public User findUser(@Param("ID") String ID,
                         @Param("password") String password);
    public User selectUser(@Param("ID") String ID);
    public Integer updateUser(User user);
    public Integer updateUserType(String ID);
}
