package cn.pqz.shopping.service.impl;

import cn.pqz.shopping.dao.OrderDao;
import cn.pqz.shopping.po.Order;
import cn.pqz.shopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public Integer addOrder(Order order) {
        return this.orderDao.addOrder(order);
    }

    @Override
    public List<Order> findOrder(String user_id) {
        return this.orderDao.findOrder(user_id);
    }

    @Override
    public Integer deleteOrder(Integer id) {
        return this.orderDao.deleteOrder(id);
    }

    @Override
    public void updateOrderType(Integer id) {
        this.orderDao.updateOrderType(id);
    }
}
