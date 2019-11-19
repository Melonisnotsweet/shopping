package cn.pqz.shopping.controller;

import cn.pqz.shopping.po.Bill;
import cn.pqz.shopping.service.BillService;
import cn.pqz.shopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BillController {
    @Autowired
    private BillService billService;
    @Autowired
    private OrderService orderService;
    @RequestMapping("/bill/toBill")
    public String toBill(HttpSession session, Model model)
    {
        String user_id=(String) session.getAttribute("UserId");
        List<Bill> bills=billService.findBill(user_id);
        model.addAttribute("bills",bills);
        return "bill";
    }
    @RequestMapping(value = "/bill/addBill/")
    public String toAddBill(HttpSession session,
                            Integer price,
                            Integer id)
    {
        Bill bill=new Bill();
        bill.setPrice(price);
        String user_id=(String) session.getAttribute("UserId");
        bill.setUser_id(user_id);
        billService.addBill(bill);
        orderService.updateOrderType(id);
        return "redirect:/bill/toBill";
    }
    @RequestMapping(value = "/bill/deleteBill{id}")
    public String deleteBill(@PathVariable("id") Integer id)
    {
        billService.deleteBill(id);
        return "redirect:/bill/toBill";
    }
}
