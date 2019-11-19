package cn.pqz.shopping.service;

import cn.pqz.shopping.po.Bill;

import java.util.List;

public interface BillService {
    public Integer addBill(Bill bill);
    public List<Bill> findBill(String user_id);
    public Integer deleteBill(Integer id);
}
