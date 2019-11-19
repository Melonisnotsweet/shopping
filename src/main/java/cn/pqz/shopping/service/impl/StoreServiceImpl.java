package cn.pqz.shopping.service.impl;

import cn.pqz.shopping.dao.StoreDao;
import cn.pqz.shopping.po.Store;
import cn.pqz.shopping.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "storeService")
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreDao storeDao;
    @Override
    public Store findStore(String user_ID) {
        return this.storeDao.findStore(user_ID);
    }

    @Override
    public Integer addStore(Store store) {
        return this.storeDao.addStore(store);
    }
}
