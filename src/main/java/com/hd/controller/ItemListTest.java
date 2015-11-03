package com.hd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import com.hd.ssm.pojo.Items;

@Controller
public class ItemListTest {
    @RequestMapping(value = "/queryItem.action", method = {RequestMethod.POST,
            RequestMethod.GET})
    public ModelAndView queryItem() {
        // 商品列表
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("lenove联想电脑");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430");

        Items items_2 = new Items();
        items_2.setName("apple");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6 apple 苹果手机！");

        Items items_3 = new Items();
        items_3.setName("samsung三星手机");
        items_3.setPrice(5000f);
        items_3.setDetail("samsung note5!");


        itemsList.add(items_1);
        itemsList.add(items_2);
        itemsList.add(items_3);

        // 创建modelAndView准备填充数据、设置视图
        ModelAndView modelAndView = new ModelAndView();
        // 填充数据
        modelAndView.addObject("itemsList", itemsList);
        // 视图
        modelAndView.setViewName("order/itemsList");

        return modelAndView;
    }

}