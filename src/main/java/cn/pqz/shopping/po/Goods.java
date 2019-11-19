package cn.pqz.shopping.po;

public class Goods {
    private Integer id;
    private String good_name;
    private String good_type;
    private String store_ID;
    private Integer price;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", good_name='" + good_name + '\'' +
                ", good_type=" + good_type +
                ", store_ID='" + store_ID + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public String getGood_type() {
        return good_type;
    }

    public void setGood_type(String good_type) {
        this.good_type = good_type;
    }

    public String getStore_ID() {
        return store_ID;
    }

    public void setStore_ID(String store_ID) {
        this.store_ID = store_ID;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
