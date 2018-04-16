package po;

public class Comment {
  private Long comment_id;
  private Long comment_pid;
  private String comment_pname;
  private Long comment_article_id;
  private String comment_author_name;
  private String comment_author_email;
  private String comment_author_url;
  private String comment_content;
  private String comment_agent;
  private String comment_ip;
  private java.sql.Timestamp comment_create_time;
  private Long comment_role;
  private Long comment_status;

  public Long getComment_id() {
    return comment_id;
  }

  public void setComment_id(Long comment_id) {
    this.comment_id = comment_id;
  }

  public Long getComment_pid() {
    return comment_pid;
  }

  public void setComment_pid(Long comment_pid) {
    this.comment_pid = comment_pid;
  }

  public String getComment_pname() {
    return comment_pname;
  }

  public void setComment_pname(String comment_pname) {
    this.comment_pname = comment_pname;
  }

  public Long getComment_article_id() {
    return comment_article_id;
  }

  public void setComment_article_id(Long comment_article_id) {
    this.comment_article_id = comment_article_id;
  }

  public String getComment_author_name() {
    return comment_author_name;
  }

  public void setComment_author_name(String comment_author_name) {
    this.comment_author_name = comment_author_name;
  }

  public String getComment_author_email() {
    return comment_author_email;
  }

  public void setComment_author_email(String comment_author_email) {
    this.comment_author_email = comment_author_email;
  }

  public String getComment_author_url() {
    return comment_author_url;
  }

  public void setComment_author_url(String comment_author_url) {
    this.comment_author_url = comment_author_url;
  }

  public String getComment_content() {
    return comment_content;
  }

  public void setComment_content(String comment_content) {
    this.comment_content = comment_content;
  }

  public String getComment_agent() {
    return comment_agent;
  }

  public void setComment_agent(String comment_agent) {
    this.comment_agent = comment_agent;
  }

  public String getComment_ip() {
    return comment_ip;
  }

  public void setComment_ip(String comment_ip) {
    this.comment_ip = comment_ip;
  }

  public java.sql.Timestamp getComment_create_time() {
    return comment_create_time;
  }

  public void setComment_create_time(java.sql.Timestamp comment_create_time) {
    this.comment_create_time = comment_create_time;
  }

  public Long getComment_role() {
    return comment_role;
  }

  public void setComment_role(Long comment_role) {
    this.comment_role = comment_role;
  }

  public Long getComment_status() {
    return comment_status;
  }

  public void setComment_status(Long comment_status) {
    this.comment_status = comment_status;
  }
}
