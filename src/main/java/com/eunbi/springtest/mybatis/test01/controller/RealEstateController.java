package com.eunbi.springtest.mybatis.test01.controller;

import com.eunbi.springtest.mybatis.test01.domain.RealEstate;
import com.eunbi.springtest.mybatis.test01.service.RealEstateService;
import jdk.jfr.Threshold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/mybatis/real-estate/select")
public class RealEstateController {
    @Autowired
    private RealEstateService realEstateService;

    @ResponseBody
    @RequestMapping("/1")
    public RealEstate realEstate(@RequestParam("id") int id) {
        return realEstateService.getRealEstate(id);
    }

    @ResponseBody
    @RequestMapping("/2")
    public List<RealEstate> realEstateRentPrice(@RequestParam("rent") int rentPrice) {
        return realEstateService.getRealEstateRentPrice(rentPrice);
    }


    @ResponseBody
    @RequestMapping("/3")
    public List<RealEstate> realEstateAreaAndPrice(@RequestParam("area") int area,
                           @RequestParam("price") int price) {
        return realEstateService.getRealEstateListByAreaAndPrice(area,price);

    }

    @ResponseBody
    @RequestMapping("/write")
    public String insertInfo1() {
        RealEstate realEstate = new RealEstate();

        realEstate.setId(3);
        realEstate.setAddress("푸르지용 리버 303동 1104호");
        realEstate.setArea(89);
        realEstate.setType("매매");
        realEstate.setPrice(100000);


        int count = realEstateService.createRealEstate(realEstate);
        return "입력 성공 : " + count;
    }

    @ResponseBody
    @RequestMapping("/write2")
    public String insertInfo2(@RequestParam("realtorId") int realtorId) {
        RealEstate realEstate = new RealEstate();


        realEstate.setId(4);
        realEstate.setAddress("썅떼빌리버 오피스텔 814호");
        realEstate.setArea(45);
        realEstate.setType("월세");
        realEstate.setPrice(100000);
        realEstate.setRentPrice(120);

        int count = realEstateService.createRealEstate2(realtorId);
        return "입력 성공 : " + count;
    }


//    @ResponseBody
//    @RequestMapping("/modify")
//    public modifyRealEstate() {


//        int count = realEstateService.createRealEstate2);
//        return count;
//    }




}
