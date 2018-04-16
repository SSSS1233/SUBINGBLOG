package po;

public class Link {
  private Long link_id;
  private String link_url;
  private String link_name;
  private String link_image;
  private String link_description;
  private String link_owner_nickname;
  private String link_owner_contact;
  private java.sql.Timestamp link_update_time;
  private java.sql.Timestamp link_create_time;
  private Long link_order;
  private Long link_status;

  public Long getLink_id() {
    return link_id;
  }

  public void setLink_id(Long link_id) {
    this.link_id = link_id;
  }

  public String getLink_url() {
    return link_url;
  }

  public void setLink_url(String link_url) {
    this.link_url = link_url;
  }

  public String getLink_name() {
    return link_name;
  }

  public void setLink_name(String link_name) {
    this.link_name = link_name;
  }

  public String getLink_image() {
    return link_image;
  }

  public void setLink_image(String link_image) {
    this.link_image = link_image;
  }

  public String getLink_description() {
    return link_description;
  }

  public void setLink_description(String link_description) {
    this.link_description = link_description;
  }

  public String getLink_owner_nickname() {
    return link_owner_nickname;
  }

  public void setLink_owner_nickname(String link_owner_nickname) {
    this.link_owner_nickname = link_owner_nickname;
  }

  public String getLink_owner_contact() {
    return link_owner_contact;
  }

  public void setLink_owner_contact(String link_owner_contact) {
    this.link_owner_contact = link_owner_contact;
  }

  public java.sql.Timestamp getLink_update_time() {
    return link_update_time;
  }

  public void setLink_update_time(java.sql.Timestamp link_update_time) {
    this.link_update_time = link_update_time;
  }

  public java.sql.Timestamp getLink_create_time() {
    return link_create_time;
  }

  public void setLink_create_time(java.sql.Timestamp link_create_time) {
    this.link_create_time = link_create_time;
  }

  public Long getLink_order() {
    return link_order;
  }

  public void setLink_order(Long link_order) {
    this.link_order = link_order;
  }

  public Long getLink_status() {
    return link_status;
  }

  public void setLink_status(Long link_status) {
    this.link_status = link_status;
  }
}
