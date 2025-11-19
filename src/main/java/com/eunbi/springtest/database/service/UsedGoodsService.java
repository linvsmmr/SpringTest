package com.eunbi.springtest.database.service;

import com.eunbi.springtest.database.domain.UsedGoods;
import com.eunbi.springtest.database.repository.UsedGoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 데이터 가공 처리
// 데이터 불러오는 클래스는 따로
@Service
public class UsedGoodsService {
//    // 무분별하게 많은 객체가 생성되는 것을 방지함
//    // 의존성 주입 - DI
//    // 스프링 프레임워크가 직접 객체 생성을 관리
//    @Autowired
//    private UsedGoodsRepository usedGoodsRepository;
//
//    // 중고 거래 게시글 리스트 얻어오기
//    public List<UsedGoods> getUsedGoodsList() {
//        List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
//        return usedGoodsList;
//    }
}
