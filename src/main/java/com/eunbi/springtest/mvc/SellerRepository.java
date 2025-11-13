package com.eunbi.springtest.mvc;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellerRepository {

    public Seller selectSellerInfo();


}
