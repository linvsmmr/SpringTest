package com.eunbi.springtest.mybatis.test01.service;

import com.eunbi.springtest.mybatis.test01.domain.RealEstate;
import com.eunbi.springtest.mybatis.test01.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RealEstateService {
    @Autowired
    private RealEstateRepository realEstateRepository;

    public RealEstate getRealEstate(int id) {
        RealEstate realEstate = realEstateRepository.selectRealEstate(id);
        return realEstate;
    }

    public List<RealEstate> getRealEstateRentPrice(int rentPrice) {
        List<RealEstate> realEstateList = realEstateRepository.selectRealEstateRentPrice(rentPrice);
        return realEstateList;
    }

    public List<RealEstate> getRealEstateListByAreaAndPrice(int area, int price) {
        List<RealEstate> realEstateList = realEstateRepository.selectRealEstateAreaAndPrice(area,price);
        return realEstateList;
    }

    public int createRealEstate(RealEstate realEstate) {
        int count = realEstateRepository.insertRealEstate(realEstate);
        return count;
    }

    public int createRealEstate2(int realtorId) {
        int count = realEstateRepository.insertRealEstate2(realtorId);
        return count;
    }
}