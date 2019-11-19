package cn.pqz.shopping.service;

import cn.pqz.shopping.po.Goods;

import java.util.List;

public interface GoodsService {
    public List<Goods> findGoods(String good_name,String store_ID,String good_type);
    public List<Goods> selectGoods(String store_ID);
    public Integer addGoods(Goods goods);
    public Integer deleteGood(Integer id);
    public List<Goods> findScGoods(String user_id);
    public List<Goods> findColGoods(String user_id);
}
