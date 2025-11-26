package com.eunbi.springtest.jpa.company;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jpa/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @ResponseBody
    @GetMapping("/add")
    public Company addCompany() {
//        Company company = companyService.createCompany("넥손", "컨텐츠 게임", "대기업", 3585);
        Company company = companyService.createCompany("버블팡", "여신 금융업", "대기업", 6934);

        return company;
    }


    @ResponseBody
    @GetMapping("/modify")
    public Company updateCompany() {

        Company company = companyService.modifyCompany(9,"중소기업",34);


        return company;
    }


    @ResponseBody
    @GetMapping("/delete")
    public String deleteCompany() {

        companyService.deleteCompany(8);

        return "수행 완료";
    }




}
