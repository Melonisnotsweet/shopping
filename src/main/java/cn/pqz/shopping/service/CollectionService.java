package cn.pqz.shopping.service;

import cn.pqz.shopping.po.Collection;
public interface CollectionService {
    public Integer addGoodsToCol(Collection collection);
    public Integer deleteGoodsFromCol(Integer good_id);
}
