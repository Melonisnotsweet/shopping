package cn.pqz.shopping.po;

public class GoodsType {
    private String id;
    private String type;

    @Override
    public String toString() {
        return "GoodsType{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
