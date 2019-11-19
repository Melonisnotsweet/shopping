package cn.pqz.shopping.service.impl;

import cn.pqz.shopping.dao.GoodsDao;
import cn.pqz.shopping.po.Goods;
import cn.pqz.shopping.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.commons.lang.StringUtils;
import java.util.List;


@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> findGoods(String good_name,String store_ID,String good_type) {

        Goods goods=new Goods();
        if(StringUtils.isNotBlank(good_name)){
            goods.setGood_name(good_name);
        }
        if(StringUtils.isNotBlank(store_ID)){
            goods.setStore_ID(store_ID);
        }
        if(StringUtils.isNotBlank(good_type)){
            goods.setGood_type(good_type);
        }
        return this.goodsDao.findGoods(goods);
    }

    @Override
    public List<Goods> selectGoods(String store_ID) {
        return this.goodsDao.selectGoods(store_ID);
    }

    @Override
    public Integer addGoods(Goods goods) {
        return this.goodsDao.addGoods(goods);
    }

    @Override
    public Integer deleteGood(Integer id) {
        return this.goodsDao.deleteGood(id);
    }

    @Override
    public List<Goods> findScGoods(String user_id) {
        return this.goodsDao.findScGoods(user_id);
    }

    @Override
    public List<Goods> findColGoods(String user_id) {
        return this.goodsDao.findColGoods(user_id);
    }

}
