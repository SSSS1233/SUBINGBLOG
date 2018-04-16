package service.Impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 21:09.
 * @Comment
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    public String selectName(String user_name) {
        return userDao.selectName(user_name);
    }

    public String selectPassByName(String user_name) {
        return userDao.selectPassByName(user_name);
    }
}
