package po;

public class Page {
  private Long page_id;
  private String page_key;
  private String page_title;
  private String page_content;
  private java.sql.Timestamp page_create_time;
  private java.sql.Timestamp page_update_time;
  private Long page_view_count;
  private Long page_comment_count;
  private Long page_status;

  public Long getPage_id() {
    return page_id;
  }

  public void setPage_id(Long page_id) {
    this.page_id = page_id;
  }

  public String getPage_key() {
    return page_key;
  }

  public void setPage_key(String page_key) {
    this.page_key = page_key;
  }

  public String getPage_title() {
    return page_title;
  }

  public void setPage_title(String page_title) {
    this.page_title = page_title;
  }

  public String getPage_content() {
    return page_content;
  }

  public void setPage_content(String page_content) {
    this.page_content = page_content;
  }

  public java.sql.Timestamp getPage_create_time() {
    return page_create_time;
  }

  public void setPage_create_time(java.sql.Timestamp page_create_time) {
    this.page_create_time = page_create_time;
  }

  public java.sql.Timestamp getPage_update_time() {
    return page_update_time;
  }

  public void setPage_update_time(java.sql.Timestamp page_update_time) {
    this.page_update_time = page_update_time;
  }

  public Long getPage_view_count() {
    return page_view_count;
  }

  public void setPage_view_count(Long page_view_count) {
    this.page_view_count = page_view_count;
  }

  public Long getPage_comment_count() {
    return page_comment_count;
  }

  public void setPage_comment_count(Long page_comment_count) {
    this.page_comment_count = page_comment_count;
  }

  public Long getPage_status() {
    return page_status;
  }

  public void setPage_status(Long page_status) {
    this.page_status = page_status;
  }
}
