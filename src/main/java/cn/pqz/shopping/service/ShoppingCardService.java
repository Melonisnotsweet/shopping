package cn.pqz.shopping.service;

import cn.pqz.shopping.po.ShoppingCard;

public interface ShoppingCardService {
    public Integer addGoodsToSc(ShoppingCard shoppingCard);
    public Integer deleteGoods(Integer good_id);
}
