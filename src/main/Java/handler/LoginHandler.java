package handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Article;
import po.Comment;
import po.CommentExpand;
import po.User;
import service.ArticleService;
import service.CommentService;
import service.UserService;

import javax.servlet.http.HttpSession;
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
    @Autowired
    CommentService commentService;
    @RequestMapping(value = "login")
    public String  login()
    {
        return "Admin/login";
    }
    @ResponseBody
    @RequestMapping(value = "logincheck")
    public Map<String,Object> logincheck(Model m, User user, HttpSession session)
    {
        System.out.println("LLLL");
        Map<String,Object> map=new HashMap<String, Object>();
        if(userService.selectName(user.getUser_name())!=null)
        {
            if(userService.selectPassByName(user.getUser_name()).equals(user.getUser_pass()))
            {
                System.out.println(user.getUser_name()+"ASDFG");
                user=userService.selectByName(user.getUser_name());
                session.setAttribute("user",user);
                map.put("message","ok");

            }else {
                map.put("message","密码错误");

            }
        }else{
            map.put("message","用户名不存在");
        }
        return map;
    }
    /*@ResponseBody
    @RequestMapping(value = "admin/comment/hide")
    public Map<String,Object> loginchecks(Model m, User user)
    {
        System.out.println("LLLL");
        Map<String,Object> map=new HashMap<String, Object>();
        return map;
    }*/
    @RequestMapping(value = "index")
    public String  index(Model m)
    {
        List<Article> l= articleService.selectArticleBytime();
        List<CommentExpand> l1=commentService.selectAll();
        System.out.println(l1.get(0).getArticles());
        m.addAttribute("articleCustomList",l);
        m.addAttribute("commentListVoList",l1);
      //  System.out.println(l1);
        return "Admin/index";
    }
}
