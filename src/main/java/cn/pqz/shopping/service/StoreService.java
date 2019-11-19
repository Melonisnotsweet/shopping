package cn.pqz.shopping.service;

import cn.pqz.shopping.po.Store;

public interface StoreService {
    public Store findStore(String user_ID);
    public Integer addStore(Store store);
}
