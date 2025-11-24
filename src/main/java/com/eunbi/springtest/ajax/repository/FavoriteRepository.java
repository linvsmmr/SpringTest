package com.eunbi.springtest.ajax.repository;

import com.eunbi.springtest.ajax.domain.Favorites;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FavoriteRepository {

    public List<Favorites> selectFavoriteList();

    public int insertFavorite(
            @Param("name") String name
            , @Param("url") String url);
}
