package cn.pqz.shopping.service.impl;

import cn.pqz.shopping.dao.GoodsTypeDao;
import cn.pqz.shopping.po.GoodsType;
import cn.pqz.shopping.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsTypeService")
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    private GoodsTypeDao goodsTypeDao;
    @Override
    public List<GoodsType> findGoodsType() {
        return this.goodsTypeDao.findGoodsType();
    }
}
