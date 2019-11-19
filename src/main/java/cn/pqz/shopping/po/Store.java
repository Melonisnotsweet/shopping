package cn.pqz.shopping.po;

public class Store {
    private Integer id;
    private String store_name;
    private Integer credit;
    private String user_ID;
    private String store_info;

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", store_name='" + store_name + '\'' +
                ", credit=" + credit +
                ", user_ID='" + user_ID + '\'' +
                ", store_info='" + store_info + '\'' +
                '}';
    }

    public String getStore_info() {
        return store_info;
    }

    public void setStore_info(String store_info) {
        this.store_info = store_info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }
}
