package com.eunbi.springtest.database.domain;

import java.time.LocalDateTime;

public class UsedGoods {
// 특정 테이블의 한 행을 저장하기 위한 클래스
// 컬럼 이름과 정확히 대응되는 멤버변수를 가진 클래스

    private int id;
    private int sellerId;
    private String title;
    private int price;
    private String description;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
