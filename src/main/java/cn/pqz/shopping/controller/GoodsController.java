package cn.pqz.shopping.controller;

import cn.pqz.shopping.po.Goods;
import cn.pqz.shopping.po.GoodsType;
import cn.pqz.shopping.service.GoodsService;
import cn.pqz.shopping.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsTypeService goodsTypeService;
    @RequestMapping(value = "/goods/goodlist")
    public String toGoodsList(@RequestParam(value = "good_name",required = false) String good_name,
                              @RequestParam(value = "store_ID",required = false) String store_ID,
                              @RequestParam(value = "good_type",required = false) String good_type, Model model)
    {

        List<Goods> goods=goodsService.findGoods(good_name,store_ID,good_type);
        List<GoodsType> goodsTypes=goodsTypeService.findGoodsType();
//        model.addAttribute("good_name",good_name);
////        model.addAttribute("store_ID",store_ID);
////        model.addAttribute("good_type",good_type);
        model.addAttribute("goods",goods);
        model.addAttribute("goodsType",goodsTypes);
        return "goodslist";
    }
    @RequestMapping(value = "/goods/hello")
    public String toHello()
    {
        return "hello";
    }
}
