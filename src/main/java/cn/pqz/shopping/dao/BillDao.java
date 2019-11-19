package cn.pqz.shopping.dao;

import cn.pqz.shopping.po.Bill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillDao {
    public Integer addBill(Bill bill);
    public List<Bill> findBill(String user_id);
    public Integer deleteBill(Integer id);
}
