package com.eunbi.springtest.jpa.recruit;

import com.eunbi.springtest.jpa.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

    public List<Recruit> findById(int id);

    public List<Recruit> findByCompanyId(int companyId);

    public List<Recruit> findByPositionAndType(String position,String type);

    public List<Recruit> findByTypeOrSalary(String type, int salary);

    public List<Recruit> findTop3ByTypeOrderBySalaryDesc(String type);

    public List<Recruit> findByRegionAndSalaryBetween(String region, int salary1, int salary2);

    @Query(value = "SELECT * FROM `recruit` WHERE `deadline` > :deadline AND `salary` >= :salary AND `type` = :type ORDER BY salary DESC", nativeQuery = true)
    public List<Recruit> selectByDeadlineAndSalaryAndTypeOrderBySalaryDesc(LocalDate deadline, int salary, String type);


}
