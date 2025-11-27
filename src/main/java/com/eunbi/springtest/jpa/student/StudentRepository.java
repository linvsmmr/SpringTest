package com.eunbi.springtest.jpa.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// <데이터타입, 해당 테이블의 프라이머리 키 타입>
public interface StudentRepository extends JpaRepository<Student,Integer> {

    // 특정 이름과 일치하는 행 조회
    public List<Student> findByName(String name);


    public List<Student> findAllByOrderByIdDesc();


    // 전달받은 이름과 일치하는 행들을 id기준으로 내림차순 2개 조회
    public List<Student> findTop2ByNameOrderByIdDesc(String name);

    // 전달받은 이름들과 일치하는 행 조회
    public List<Student> findByNameIn(List<String> nameList);

    // 쿼리 직접 작성
    @Query(value="SELECT * FROM `new_student` WHERE `dream_job` = :dreamJob", nativeQuery = true)
    public List<Student> selectByDreamJob(@Param("dreamJob") String dreamJob);


}
