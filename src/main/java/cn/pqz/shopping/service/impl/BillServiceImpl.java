package cn.pqz.shopping.service.impl;

import cn.pqz.shopping.dao.BillDao;
import cn.pqz.shopping.po.Bill;
import cn.pqz.shopping.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("billService")
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao;
    @Override
    public Integer addBill(Bill bill) {
        return this.billDao.addBill(bill);
    }

    @Override
    public List<Bill> findBill(String user_id) {
        return this.billDao.findBill(user_id);
    }

    @Override
    public Integer deleteBill(Integer id) {
        return this.billDao.deleteBill(id);
    }
}
