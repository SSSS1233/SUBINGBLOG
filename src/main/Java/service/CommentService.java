package service;

import po.Comment;
import po.CommentExpand;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 22:23.
 * @Comment
 */
@Transactional
public interface CommentService {
    List<CommentExpand> selectAll();
    void update(Comment comment);
    Comment selectById(int id);
    void insert(Comment comment);
}
