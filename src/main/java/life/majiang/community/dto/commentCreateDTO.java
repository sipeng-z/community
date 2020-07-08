package life.majiang.community.dto;

public class commentCreateDTO {

    private Long parentId;
    private String content;
    private Integer type;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "commentCreateDTO{" +
                "parentId=" + parentId +
                ", content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
