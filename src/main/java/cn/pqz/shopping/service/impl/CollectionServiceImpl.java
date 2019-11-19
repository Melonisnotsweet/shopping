package cn.pqz.shopping.service.impl;

import cn.pqz.shopping.dao.CollectionDao;
import cn.pqz.shopping.po.Collection;
import cn.pqz.shopping.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("collectionService")
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    private CollectionDao collectionDao;
    @Override
    public Integer addGoodsToCol(Collection collection) {
        return this.collectionDao.addGoodsToCol(collection);
    }

    @Override
    public Integer deleteGoodsFromCol(Integer good_id) {
        return this.collectionDao.deleteGoodsFromCol(good_id);
    }
}
