package handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/17 0:31.
 * @Comment
 */
@Controller
public class CommentHandler {
    @ResponseBody
    @RequestMapping(value = "admin/comment/hide")
    public Map<String,Object> loginchecks(Model m)
    {
        System.out.println("LLLL");
        Map<String,Object> map=new HashMap<String, Object>();
        return map;
    }
}
