package po;

public class User {
  private Long user_id;
  private String user_name;
  private String user_pass;
  private String user_nickname;
  private String user_email;
  private String user_url;
  private String user_avatar;
  private String user_last_login_ip;
  private java.sql.Timestamp user_register_time;
  private java.sql.Timestamp user_last_login_time;
  private Long user_status;

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getUser_pass() {
    return user_pass;
  }

  public void setUser_pass(String user_pass) {
    this.user_pass = user_pass;
  }

  public String getUser_nickname() {
    return user_nickname;
  }

  public void setUser_nickname(String user_nickname) {
    this.user_nickname = user_nickname;
  }

  public String getUser_email() {
    return user_email;
  }

  public void setUser_email(String user_email) {
    this.user_email = user_email;
  }

  public String getUser_url() {
    return user_url;
  }

  public void setUser_url(String user_url) {
    this.user_url = user_url;
  }

  public String getUser_avatar() {
    return user_avatar;
  }

  public void setUser_avatar(String user_avatar) {
    this.user_avatar = user_avatar;
  }

  public String getUser_last_login_ip() {
    return user_last_login_ip;
  }

  public void setUser_last_login_ip(String user_last_login_ip) {
    this.user_last_login_ip = user_last_login_ip;
  }

  public java.sql.Timestamp getUser_register_time() {
    return user_register_time;
  }

  public void setUser_register_time(java.sql.Timestamp user_register_time) {
    this.user_register_time = user_register_time;
  }

  public java.sql.Timestamp getUser_last_login_time() {
    return user_last_login_time;
  }

  public void setUser_last_login_time(java.sql.Timestamp user_last_login_time) {
    this.user_last_login_time = user_last_login_time;
  }

  public Long getUser_status() {
    return user_status;
  }

  public void setUser_status(Long user_status) {
    this.user_status = user_status;
  }
}
