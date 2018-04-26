package service;

import po.Category;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Author SUBING
 * @Date 2018/4/26 17:33.
 * @Comment
 */
@Transactional
public interface CategoryService {
    List<Category> selectAll();
}
