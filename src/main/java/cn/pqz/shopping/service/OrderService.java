package cn.pqz.shopping.service;

import cn.pqz.shopping.po.Order;

import java.util.List;

public interface OrderService {
    public Integer addOrder(Order order);
    public List<Order> findOrder(String user_id);
    public Integer deleteOrder(Integer id);
    public void updateOrderType(Integer id);
}
