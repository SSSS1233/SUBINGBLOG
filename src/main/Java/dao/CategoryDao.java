package dao;

import po.Category;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/26 17:19.
 * @Comment
 */
public interface CategoryDao {
   List<Category> selectAll();
}
