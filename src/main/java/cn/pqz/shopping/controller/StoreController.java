package cn.pqz.shopping.controller;

import cn.pqz.shopping.po.Goods;
import cn.pqz.shopping.po.GoodsType;
import cn.pqz.shopping.po.Store;
import cn.pqz.shopping.service.GoodsService;
import cn.pqz.shopping.service.GoodsTypeService;
import cn.pqz.shopping.service.StoreService;
import cn.pqz.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class    StoreController {
    @Autowired
    private StoreService storeService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;
    @Autowired
    private GoodsTypeService goodsTypeService;
    @RequestMapping(value = "/store/toStore")
    public String store(HttpSession session, Model model)
    {
        String store_ID=(String) session.getAttribute("UserId");
//        System.out.println(store_ID);
        List<Goods> goods=goodsService.selectGoods(store_ID);
        Store store=storeService.findStore(store_ID);
        model.addAttribute("storeGoods",goods);
        model.addAttribute("store",store);
        return "store";
    }
    @RequestMapping(value = "/store/toAddStore")
    public String toAddStore()
    {
        return "addstore";
    }
    @RequestMapping(value = "/store/addStore",method = RequestMethod.POST)
    public String addStore(Store store,HttpSession session)
    {
        String user_ID=(String) session.getAttribute("UserId");
        store.setUser_ID(user_ID);
        storeService.addStore(store);
        userService.updateUserType(user_ID);
        return "redirect:/store/toStore";
    }
    @RequestMapping(value = "/store/toAddGoods")
    public String toAddGoods(Model model)
    {
        List<GoodsType> goodsTypes=goodsTypeService.findGoodsType();
        model.addAttribute("goodsType",goodsTypes);
        return "addgoods";
    }
    @RequestMapping(value = "/store/addGoods")
    public String addGoods(HttpSession session,Goods goods)
    {
        String store_ID=(String) session.getAttribute("UserId");
        goods.setStore_ID(store_ID);
        goodsService.addGoods(goods);
        return "redirect:/store/toStore";
    }
    @RequestMapping(value = "/store/deleteGood{id}")
    public String deleteGood(@PathVariable("id") Integer id)
    {
        goodsService.deleteGood(id);
        return "redirect:/store/toStore";
    }

}
