package po;

public class Tag {
  private Long tag_id;
  private String tag_name;
  private String tag_description;
  private Long tag_status;

  public Long getTag_id() {
    return tag_id;
  }

  public void setTag_id(Long tag_id) {
    this.tag_id = tag_id;
  }

  public String getTag_name() {
    return tag_name;
  }

  public void setTag_name(String tag_name) {
    this.tag_name = tag_name;
  }

  public String getTag_description() {
    return tag_description;
  }

  public void setTag_description(String tag_description) {
    this.tag_description = tag_description;
  }

  public Long getTag_status() {
    return tag_status;
  }

  public void setTag_status(Long tag_status) {
    this.tag_status = tag_status;
  }
}
