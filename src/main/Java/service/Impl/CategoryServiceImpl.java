package service.Impl;

import dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Category;
import service.CategoryService;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/26 17:33.
 * @Comment
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryDao categoryDao;
    public List<Category> selectAll() {
        return categoryDao.selectAll();
    }
}
