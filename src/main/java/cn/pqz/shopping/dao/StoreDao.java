package cn.pqz.shopping.dao;

import cn.pqz.shopping.po.Store;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreDao {
    public Store findStore(String user_ID);
    public Integer addStore(Store store);
}
