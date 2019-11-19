package cn.pqz.shopping.dao;

import cn.pqz.shopping.po.GoodsType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsTypeDao {
    public List<GoodsType> findGoodsType();
}
