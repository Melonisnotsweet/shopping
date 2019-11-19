package cn.pqz.shopping.controller;

import cn.pqz.shopping.po.Collection;
import cn.pqz.shopping.po.Goods;
import cn.pqz.shopping.service.CollectionService;
import cn.pqz.shopping.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CollectionController {
    @Autowired
    private CollectionService collectionService;
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/collection/addGoodtoCol{good_id}")
    public String addGoodtoCol(@PathVariable("good_id") Integer good_id, HttpSession session)
    {
        String user_id=(String)session.getAttribute("UserId");
        Collection collection=new Collection();
        collection.setGood_id(good_id);
        collection.setUser_id(user_id);
        collectionService.addGoodsToCol(collection);
        return "redirect:/goods/goodlist";
    }
    @RequestMapping("/collection/toCol")
    public String toCollection(HttpSession session, Model model)
    {
        String user_id=(String)session.getAttribute("UserId");
        List<Goods> goods=goodsService.findColGoods(user_id);
        model.addAttribute("goods",goods);
        return "collection";
    }
    @RequestMapping("/collection/deleteGoods{good_id}")
    public String deleteGoods(@PathVariable("good_id")Integer good_id )
    {
        collectionService.deleteGoodsFromCol(good_id);
        return "redirect:/collection/toCol";
    }

}
