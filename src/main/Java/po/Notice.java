package po;

public class Notice {
  private Long notice_id;
  private String notice_title;
  private String notice_content;
  private java.sql.Timestamp notice_create_time;
  private java.sql.Timestamp notice_update_time;
  private Long notice_status;
  private Long notice_order;

  public Long getNotice_id() {
    return notice_id;
  }

  public void setNotice_id(Long notice_id) {
    this.notice_id = notice_id;
  }

  public String getNotice_title() {
    return notice_title;
  }

  public void setNotice_title(String notice_title) {
    this.notice_title = notice_title;
  }

  public String getNotice_content() {
    return notice_content;
  }

  public void setNotice_content(String notice_content) {
    this.notice_content = notice_content;
  }

  public java.sql.Timestamp getNotice_create_time() {
    return notice_create_time;
  }

  public void setNotice_create_time(java.sql.Timestamp notice_create_time) {
    this.notice_create_time = notice_create_time;
  }

  public java.sql.Timestamp getNotice_update_time() {
    return notice_update_time;
  }

  public void setNotice_update_time(java.sql.Timestamp notice_update_time) {
    this.notice_update_time = notice_update_time;
  }

  public Long getNotice_status() {
    return notice_status;
  }

  public void setNotice_status(Long notice_status) {
    this.notice_status = notice_status;
  }

  public Long getNotice_order() {
    return notice_order;
  }

  public void setNotice_order(Long notice_order) {
    this.notice_order = notice_order;
  }
}
