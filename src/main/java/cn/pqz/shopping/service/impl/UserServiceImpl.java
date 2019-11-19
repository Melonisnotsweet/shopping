package cn.pqz.shopping.service.impl;
import cn.pqz.shopping.dao.UserDao;
import cn.pqz.shopping.po.User;
import cn.pqz.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Integer addUser(User user) {
        return this.userDao.addUser(user);
    }

    @Override
    public User findUser(String ID, String password) {
        return this.userDao.findUser(ID,password);
    }

    @Override
    public User selectUser(String ID) {
        return this.userDao.selectUser(ID);
    }

    @Override
    public Integer updateUser(User user) {
        System.out.println("服务层测试"+user);
        return this.userDao.updateUser(user);
    }

    @Override
    public Integer updateUserType(String ID) {
        return this.userDao.updateUserType(ID);
    }

}
