package com.eunbi.springtest.jpa.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// <데이터타입, 해당 테이블의 프라이머리 키 타입>
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
