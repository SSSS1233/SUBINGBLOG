package po;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 22:51.
 * @Comment
 */
public class CommentExpand  extends Comment{
       Article articles;

    public Article getArticles() {
        return articles;
    }

    public void setArticles(Article articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "CommentExpand{" +
                "articles=" + articles +
                "} " + super.toString();
    }
}
