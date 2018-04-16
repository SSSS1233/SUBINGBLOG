package po;

public class Category {
  private Long category_id;
  private Long category_pid;
  private String category_name;
  private String category_description;
  private Long category_order;
  private String category_icon;
  private Long category_status;

  public Long getCategory_id() {
    return category_id;
  }

  public void setCategory_id(Long category_id) {
    this.category_id = category_id;
  }

  public Long getCategory_pid() {
    return category_pid;
  }

  public void setCategory_pid(Long category_pid) {
    this.category_pid = category_pid;
  }

  public String getCategory_name() {
    return category_name;
  }

  public void setCategory_name(String category_name) {
    this.category_name = category_name;
  }

  public String getCategory_description() {
    return category_description;
  }

  public void setCategory_description(String category_description) {
    this.category_description = category_description;
  }

  public Long getCategory_order() {
    return category_order;
  }

  public void setCategory_order(Long category_order) {
    this.category_order = category_order;
  }

  public String getCategory_icon() {
    return category_icon;
  }

  public void setCategory_icon(String category_icon) {
    this.category_icon = category_icon;
  }

  public Long getCategory_status() {
    return category_status;
  }

  public void setCategory_status(Long category_status) {
    this.category_status = category_status;
  }
}
