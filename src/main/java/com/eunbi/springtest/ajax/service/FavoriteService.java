package com.eunbi.springtest.ajax.service;


import com.eunbi.springtest.ajax.domain.Favorites;
import com.eunbi.springtest.ajax.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {

    // IoC : 제어의 역전
    @Autowired
    private FavoriteRepository favoriteRepository;

    public List<Favorites> getFavoriteList() {
        List<Favorites> favoriteList = favoriteRepository.selectFavoriteList();

        return favoriteList;
    }

    public int createFavorite(String name, String url) {
        int count = favoriteRepository.insertFavorite(name, url);

        return count;
    }

    public boolean isDuplicateUrl(String url) {
        int count = favoriteRepository.countFavoriteUrl(url);

        return count != 0;
    }

    public int deleteFavorite(int id) {
        int count = favoriteRepository.deleteFavorite(id);
        return count;
    }

}
