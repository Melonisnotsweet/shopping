package cn.pqz.shopping.service;

import cn.pqz.shopping.po.User;

public interface UserService {
    public Integer addUser(User user);
    public User findUser(String ID,String password);
    public User selectUser(String ID);
    public Integer updateUser(User user);
    public Integer updateUserType(String ID);
}
