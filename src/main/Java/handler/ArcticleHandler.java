package handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import po.Article;
import po.Category;
import po.Comment;
import service.ArticleService;
import service.CategoryService;
import service.CommentService;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 21:43.
 * @Comment
 */
@Controller
public class ArcticleHandler {
    @Autowired
    ArticleService articleService;
    @Autowired
    CategoryService categoryService;
   @Autowired
    CommentService commentService;
    @RequestMapping(value = "article/{id}")
    public String selectArticle(@PathVariable("id")Integer id,Model m)
    {
        List<Article> article=articleService.selectById(id);
        List<Category> l=categoryService.selectAll();
        List<Comment> l1=commentService.selectByArticle(id);
        m.addAttribute("articleDetailVo",article.get(0));
        m.addAttribute("categoryList",l);
        m.addAttribute("commentCustomList",l1);
        return "Home/Page/articleDetail";
    }
}
