package handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Comment;
import po.User;
import service.CommentService;

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
    @Autowired
    CommentService commentService;
    @ResponseBody
    @RequestMapping(value = "admin/comment/hide")
    public Map<String,Object> hide(Model m, Comment comment)
    {
        System.out.println("LLLL"+comment.getComment_id());
        Long l = new Long((long)0);
        comment.setComment_status(l);
        commentService.update(comment);
        Map<String,Object> map=new HashMap<String, Object>();
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "admin/comment/approve")
    public Map<String,Object> approve(Model m, Comment comment)
    {
        System.out.println("LLLL"+comment.getComment_id());
        Long l = new Long((long)1);
        comment.setComment_status(l);
        commentService.update(comment);
        Map<String,Object> map=new HashMap<String, Object>();
        return map;
    }
    @RequestMapping(value = "admin/comment/reply/{id}")
    public String reply(@PathVariable("id") Integer id,Model m)
    {
       Comment comment= commentService.selectById(id);
       return "";
    }
}
