package com.eunbi.springtest.jpa.recruit;

import com.eunbi.springtest.jpa.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/jpa/recruit")
public class RecruitController {


    @Autowired
    private RecruitRepository recruitRepository;



    @ResponseBody
    @GetMapping("/byid")
    public List<Recruit> searchById() {
        List<Recruit> recruitList = null;
        recruitList = recruitRepository.findById(8);

        return recruitList;
    }


    @ResponseBody
    @GetMapping("/byparam")
    public List<Recruit> searchByParameter(@RequestParam("companyId") int companyId) {
        List<Recruit> recruitList = null;

        recruitList = recruitRepository.findByCompanyId(3);
        return recruitList;
    }


    @ResponseBody
    @GetMapping("/duplicate")
    public List<Recruit> searchDuplicate() {
        List<Recruit> recruitList = null;


        recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");

        return recruitList;

    }


    @ResponseBody
    @GetMapping("/duplicate2")
    public List<Recruit> searchDuplicate2() {
        List<Recruit> recruitList = null;

        recruitList = recruitRepository.findByTypeOrSalary("정규직", 9000);

        return recruitList;
    }


    @ResponseBody
    @GetMapping("/restrict")
    public List<Recruit> searchLimit() {
        List<Recruit> recruitList = null;

        recruitList = recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");

        return recruitList;
    }

    @ResponseBody
    @GetMapping("/spectrum")
    public List<Recruit> searchSpectrum() {
        List<Recruit> recruitList = null;

        recruitList = recruitRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);

        return recruitList;
    }


    @ResponseBody
    @GetMapping("/by-query")
    public List<Recruit> searchByQuery() {
        List<Recruit> recruitList = null;

        recruitList = recruitRepository.selectByDeadlineAndSalaryAndTypeOrderBySalaryDesc(LocalDate.parse("2026-04-10"), 8100, "정규직");


        return recruitList;
    }





}
