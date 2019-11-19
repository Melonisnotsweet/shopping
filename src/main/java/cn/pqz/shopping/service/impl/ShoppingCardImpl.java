package cn.pqz.shopping.service.impl;

import cn.pqz.shopping.dao.ShoppingCardDao;
import cn.pqz.shopping.po.ShoppingCard;
import cn.pqz.shopping.service.ShoppingCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("shoppingCard")
public class ShoppingCardImpl implements ShoppingCardService {
    @Autowired
    private ShoppingCardDao shoppingCardDao;
    @Override
    public Integer addGoodsToSc(ShoppingCard shoppingCard) {
        return this.shoppingCardDao.addGoodsToSc(shoppingCard);
    }

    @Override
    public Integer deleteGoods(Integer good_id) {
        return this.shoppingCardDao.deleteGoods(good_id);
    }
}
