package com.eunbi.springtest.store.controller;

import com.eunbi.springtest.store.domain.Store;
import com.eunbi.springtest.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StoreController {
    @Autowired
    private StoreService storeService;

    @ResponseBody
    @RequestMapping("/store/list")
    public List<Store> storeList() {
        List<Store> storeList = storeService.getStoreList();
        return storeList;
    }

}
