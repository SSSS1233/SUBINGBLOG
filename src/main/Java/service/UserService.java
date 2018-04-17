package service;

import org.springframework.stereotype.Service;
import po.User;

import javax.transaction.Transactional;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 21:07.
 * @Comment
 */
@Transactional
public interface UserService {
    String selectName(String user_name);
    String selectPassByName(String user_name);
    User selectByName(String name);
}
