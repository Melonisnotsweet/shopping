package cn.pqz.shopping.dao;

import cn.pqz.shopping.po.ShoppingCard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingCardDao {
    public Integer addGoodsToSc(ShoppingCard shoppingCard);
    public Integer deleteGoods(Integer good_id);
}
