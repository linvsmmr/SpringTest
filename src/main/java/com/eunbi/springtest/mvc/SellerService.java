package com.eunbi.springtest.mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public Seller selectInfo() {
        Seller seller = sellerRepository.selectSellerInfo();

        return seller;

    }
}
