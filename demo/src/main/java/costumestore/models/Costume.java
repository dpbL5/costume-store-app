package costumestore.models;

public class Costume {
    private Integer id;
    private String name;
    private String type;
    private String style;
    private Integer price;
    public void setType(String type) {
        this.type = type;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getStyle() {
        return style;
    }
    public Integer getPrice() {
        return price;
    }
}
