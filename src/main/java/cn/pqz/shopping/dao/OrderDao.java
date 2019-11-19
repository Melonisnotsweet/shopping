package cn.pqz.shopping.dao;

import cn.pqz.shopping.po.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    public Integer addOrder(Order order);
    public List<Order> findOrder(String user_id);
    public Integer deleteOrder(Integer id);
    public void updateOrderType(Integer id);
}
