package cn.pqz.shopping.po;

public class Collection {
    private Integer id;
    private Integer good_id;
    private String user_id;

    @Override
    public String toString() {
        return "Collection{" +
                "id=" + id +
                ", good_id=" + good_id +
                ", user_id='" + user_id + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGood_id() {
        return good_id;
    }

    public void setGood_id(Integer good_id) {
        this.good_id = good_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
