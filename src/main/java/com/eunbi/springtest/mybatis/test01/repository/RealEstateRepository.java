package com.eunbi.springtest.mybatis.test01.repository;

import com.eunbi.springtest.mybatis.test01.domain.RealEstate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RealEstateRepository {
    public RealEstate selectRealEstate(@Param("id") int id);
    public List<RealEstate> selectRealEstateRentPrice(@Param("rentPrice") int rentPrice);
    public List<RealEstate> selectRealEstateAreaAndPrice(@Param("area") int area,
                                                         @Param("price") int price);
    public int insertRealEstate(RealEstate realEstate);
    public int insertRealEstate2(@Param("realtorId")int realtorId);
}
