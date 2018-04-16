package dao;

import po.Article;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 21:37.
 * @Comment
 */
public interface ArticleDao {
    List<Article> selectArticleBytime();
}
