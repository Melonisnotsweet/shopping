package cn.pqz.shopping.dao;

import cn.pqz.shopping.po.Collection;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectionDao {
    public Integer addGoodsToCol(Collection collection);
    public Integer deleteGoodsFromCol(Integer good_id);
}
