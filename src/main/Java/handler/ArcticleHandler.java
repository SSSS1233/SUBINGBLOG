package handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.ArticleService;

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

}
