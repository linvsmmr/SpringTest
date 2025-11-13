package com.eunbi.springtest.mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/mvc/seller")
@Controller
public class SellerController {

    @Autowired
    private SellerService sellerService;


    @GetMapping("info")
    public Seller sellerInfo(Model model) {
        Seller seller  = sellerService.selectInfo();


        model.addAttribute("title","판매자 정보");
        model.addAttribute("result", seller);

        return seller;
    }
//
//
//    public addSeller() {
//
//    }

}
