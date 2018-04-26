package service.Impl;

import dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Article;
import service.ArticleService;

import javax.xml.ws.Action;
import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 21:40.
 * @Comment
 */
@Service
public class ArcticleServiceimpl implements ArticleService {
    @Autowired
    ArticleDao articleService;

    public List<Article> selectArticleBytime() {
        return articleService.selectArticleBytime();
    }

    public List<Article> selectById(int id) {
        return articleService.selectById(id);
    }
}
