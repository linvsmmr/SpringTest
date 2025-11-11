package com.eunbi.springtest.store.service;

import com.eunbi.springtest.store.domain.Store;
import com.eunbi.springtest.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public List<Store> getStoreList() {
        List<Store> storeList = storeRepository.selectStoreList();
        return storeList;
    }
}
