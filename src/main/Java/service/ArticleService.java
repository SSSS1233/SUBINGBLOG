package service;

import po.Article;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 21:40.
 * @Comment
 */
@Transactional
public interface ArticleService {
    List<Article> selectArticleBytime();
}
