package handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Article;
import po.User;
import service.ArticleService;
import service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 17:22.
 * @Comment
 */
@Controller
public class LoginHandler {
    @Autowired
    UserService userService;
    @Autowired
    ArticleService articleService;
    @RequestMapping(value = "login")
    public String  login()
    {
        return "Admin/login";
    }
    @ResponseBody
    @RequestMapping(value = "logincheck")
    public Map<String,Object> logincheck(Model m, User user)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        if(userService.selectName(user.getUser_name())!=null)
        {
            if(userService.selectPassByName(user.getUser_name()).equals(user.getUser_pass()))
            {
                map.put("message","ok");
            }else {
                map.put("message","密码错误");
            }
        }else{
            map.put("message","用户名不存在");
        }
        return map;
    }
    @RequestMapping(value = "index")
    public String  index(Model m)
    {
        List<Article> l= articleService.selectArticleBytime();
        m.addAttribute("articleCustomList",l);
        return "Admin/index";
    }
}
