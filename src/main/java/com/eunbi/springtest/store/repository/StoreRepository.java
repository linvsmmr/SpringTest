package com.eunbi.springtest.store.repository;

import com.eunbi.springtest.store.domain.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoreRepository {
    public List<Store> selectStoreList();

}
