package com.eunbi.springtest.database.repository;

import com.eunbi.springtest.database.domain.UsedGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
// Mybatis FrameWork 를 사용함
// xml을 만들어서 사용하는 방법
public interface UsedGoodsRepository {
    // 구현 내용이 없는 메소드의 정의만 나열되는 곳

    // used_goods 모든 행 조회
    public List<UsedGoods> selectUsedGoods();
}
