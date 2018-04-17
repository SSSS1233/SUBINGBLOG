package service.Impl;

import dao.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Comment;
import po.CommentExpand;
import service.CommentService;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/16 22:23.
 * @Comment
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentDao commentDao;
    public List<CommentExpand> selectAll() {
        return commentDao.selectAll();
    }

    public void update(Comment comment) {
        commentDao.update(comment);
    }

    public Comment selectById(int id) {
        return commentDao.selectById(id);
    }

    public void insert(Comment comment) {
         commentDao.insert(comment);
    }
}
