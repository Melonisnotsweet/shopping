package cn.pqz.shopping.controller;

import cn.pqz.shopping.po.Goods;
import cn.pqz.shopping.po.Order;
import cn.pqz.shopping.po.ShoppingCard;
import cn.pqz.shopping.service.GoodsService;
import cn.pqz.shopping.service.OrderService;
import cn.pqz.shopping.service.ShoppingCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShoppingCardController {
    @Autowired
    private ShoppingCardService shoppingCardService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private OrderService orderService;
    @RequestMapping("/shopping/shoppingCard{good_id}")
    public String addGoodToSc(@PathVariable("good_id") Integer good_id, HttpSession session)
    {
        String user_id=(String)session.getAttribute("UserId");
        ShoppingCard shoppingCard=new ShoppingCard();
        shoppingCard.setGood_id(good_id);
        shoppingCard.setUser_id(user_id);
        shoppingCardService.addGoodsToSc(shoppingCard);
        return "redirect:/goods/goodlist";
    }
    @RequestMapping("/shoping/toSc")
    public String toShoppingCard(HttpSession session, Model model)
    {
        String user_id=(String)session.getAttribute("UserId");
        List<Goods> goods=goodsService.findScGoods(user_id);
        model.addAttribute("goods",goods);
        return "shoppingcard";
    }
    @RequestMapping("/shopping/deleteGoods{good_id}")
    public String deleteGoods(@PathVariable("good_id")Integer good_id )
    {
        shoppingCardService.deleteGoods(good_id);
        return "redirect:/shoping/toSc";
    }
    @RequestMapping("/shopping/toFindOrder")
    public String findOrder(HttpSession session,Model model)
    {
        String user_id=(String) session.getAttribute("UserId");
        List<Order> orders=orderService.findOrder(user_id);
        model.addAttribute("orders",orders);
        return "order";
    }
    @RequestMapping("/shopping/toOrder")
    public String toOrder(HttpSession session,Model model)
    {
        String user_id=(String)session.getAttribute("UserId");
        List<Goods> goods=goodsService.findScGoods(user_id);
        int price=0;
        for (int i=0;i<goods.size();i++){
            Goods good=goods.get(i);
            int onePrice= good.getPrice();
            System.out.println(onePrice);
            price=price+onePrice;
        }
        Order order=new Order();
        order.setPrice(price);
        order.setUser_id(user_id);
        orderService.addOrder(order);
        return "redirect:/shopping/toFindOrder";
    }
    @RequestMapping("/shopping/deleteOrder/{id}")
    public String deleteOrder(@PathVariable ("id") Integer id)
    {
        System.out.println(id);
        orderService.deleteOrder(id);
        return "redirect:/shopping/toFindOrder";
    }

}
