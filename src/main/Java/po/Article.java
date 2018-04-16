package po;

public class Article {
  private Long article_id;
  private Long article_user_id;
  private String article_title;
  private String article_content;
  private Long article_parent_category_id;
  private Long article_child_category_id;
  private String article_tag_ids;
  private Long article_view_count;
  private Long article_comment_count;
  private Long article_like_count;
  private java.sql.Timestamp article_post_time;
  private java.sql.Timestamp article_update_time;
  private Long article_is_comment;
  private Long article_status;//草稿
  private Long article_order;

  public Long getArticle_id() {
    return article_id;
  }

  public void setArticle_id(Long article_id) {
    this.article_id = article_id;
  }

  public Long getArticle_user_id() {
    return article_user_id;
  }

  public void setArticle_user_id(Long article_user_id) {
    this.article_user_id = article_user_id;
  }

  public String getArticle_title() {
    return article_title;
  }

  public void setArticle_title(String article_title) {
    this.article_title = article_title;
  }

  public String getArticle_content() {
    return article_content;
  }

  public void setArticle_content(String article_content) {
    this.article_content = article_content;
  }

  public Long getArticle_parent_category_id() {
    return article_parent_category_id;
  }

  public void setArticle_parent_category_id(Long article_parent_category_id) {
    this.article_parent_category_id = article_parent_category_id;
  }

  public Long getArticle_child_category_id() {
    return article_child_category_id;
  }

  public void setArticle_child_category_id(Long article_child_category_id) {
    this.article_child_category_id = article_child_category_id;
  }

  public String getArticle_tag_ids() {
    return article_tag_ids;
  }

  public void setArticle_tag_ids(String article_tag_ids) {
    this.article_tag_ids = article_tag_ids;
  }

  public Long getArticle_view_count() {
    return article_view_count;
  }

  public void setArticle_view_count(Long article_view_count) {
    this.article_view_count = article_view_count;
  }

  public Long getArticle_comment_count() {
    return article_comment_count;
  }

  public void setArticle_comment_count(Long article_comment_count) {
    this.article_comment_count = article_comment_count;
  }

  public Long getArticle_like_count() {
    return article_like_count;
  }

  public void setArticle_like_count(Long article_like_count) {
    this.article_like_count = article_like_count;
  }

  public java.sql.Timestamp getArticle_post_time() {
    return article_post_time;
  }

  public void setArticle_post_time(java.sql.Timestamp article_post_time) {
    this.article_post_time = article_post_time;
  }

  public java.sql.Timestamp getArticle_update_time() {
    return article_update_time;
  }

  public void setArticle_update_time(java.sql.Timestamp article_update_time) {
    this.article_update_time = article_update_time;
  }

  public Long getArticle_is_comment() {
    return article_is_comment;
  }

  public void setArticle_is_comment(Long article_is_comment) {
    this.article_is_comment = article_is_comment;
  }

  public Long getArticle_status() {
    return article_status;
  }

  public void setArticle_status(Long article_status) {
    this.article_status = article_status;
  }

  public Long getArticle_order() {
    return article_order;
  }

  public void setArticle_order(Long article_order) {
    this.article_order = article_order;
  }
}
