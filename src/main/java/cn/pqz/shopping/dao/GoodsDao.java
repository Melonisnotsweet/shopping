package cn.pqz.shopping.dao;

import cn.pqz.shopping.po.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {
    public List<Goods> findGoods(Goods goods);
    public List<Goods> selectGoods(String store_ID);
    public Integer addGoods(Goods goods);
    public Integer deleteGood(Integer id);
    public List<Goods> findScGoods(String user_id);
    public List<Goods> findColGoods(String user_id);
}
