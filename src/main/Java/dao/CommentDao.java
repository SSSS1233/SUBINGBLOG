package dao;

import po.Comment;
import po.CommentExpand;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 22:04.
 * @Comment
 */
public interface CommentDao {
  List<CommentExpand> selectAll();
  void update(Comment comment);
  Comment selectById(int id);
  void insert(Comment comment);
  List<CommentExpand> selectByStatus();
  List<Comment> selectByArticle(int id);
}
