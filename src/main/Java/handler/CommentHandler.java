package handler;

import org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Comment;
import po.CommentExpand;
import po.User;
import service.CommentService;

import javax.servlet.http.HttpSession;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
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
    public Map<String, Object> hide(Model m, Comment comment) {
        System.out.println("LLLL" + comment.getComment_id());
        Long l = new Long((long) 0);
        comment.setComment_status(l);
        commentService.update(comment);
        Map<String, Object> map = new HashMap<String, Object>();
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "admin/comment/approve")
    public Map<String, Object> approve(Model m, Comment comment) {
        System.out.println("LLLL" + comment.getComment_id());
        Long l = new Long((long) 1);
        comment.setComment_status(l);
        commentService.update(comment);
        Map<String, Object> map = new HashMap<String, Object>();
        return map;
    }

    @RequestMapping(value = "admin/comment/reply/{id}")
    public String reply(@PathVariable("id") Integer id, Model m) {
        System.out.println("LLLLL");
        Comment comment = commentService.selectById(id);
        m.addAttribute("commentCustom", comment);
        return "Admin/Comment/reply";
    }

    @RequestMapping(value = "admin/comment/replySubmit")
    public String replySubmit(Model m, String commentContent,String commentAuthorName,int commentArticleId,String commentPname
    ,String commentAuthorEmail,String commentAuthorUrl) {
        Comment comment=new Comment();
        Long id=new Long(1);
        comment.setComment_pid(id);
        comment.setComment_pname(commentAuthorName);
        Long l=new Long(commentArticleId);
        comment.setComment_article_id(l);
        comment.setComment_author_name(commentPname);
        comment.setComment_author_email(commentAuthorEmail);
        comment.setComment_author_url(commentAuthorUrl);
        comment.setComment_content(commentContent);
        comment.setComment_ip("0:0:0:0:0:0:0:1");
        Date time= new java.sql.Date(new java.util.Date().getTime());
        comment.setComment_create_time(time);
        comment.setComment_role(id);
        comment.setComment_status(id);
        commentService.insert(comment);
        List<CommentExpand> l1=commentService.selectAll();
        List<CommentExpand> l2=commentService.selectByStatus();
        m.addAttribute("commentListVoList",l1);
        m.addAttribute("hiddenCommentListVoList",l2);
        return "Admin/Comment/index";
    }

}
