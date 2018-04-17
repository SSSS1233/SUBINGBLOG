package dao;

import po.User;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 21:02.
 * @Comment
 */
public interface UserDao {
    String selectName(String user_name);
    String selectPassByName(String user_name);
    User selectByName(String name);
}
