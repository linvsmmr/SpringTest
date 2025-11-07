package com.eunbi.springtest.lifecycle;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/test01")
public class Test01Controller {
    @ResponseBody

    @RequestMapping("/1")
    public String htmlResponse() {
        return "<html>\n" +
                "   <head><tilte>Spring Test 1-2 )  String 응답하기</title></head>\n" +
                "   <body>\n" +
                "       <h2>테스트 프로젝트 완성</h2>\n" +
                "       <br>\n" +
                "       <h4>해당 프로젝트를 통해서 문제 풀이를 진행 합니다.</h4>\n" +
                "   </body>\n" +
                "</html>";
    }


    @RequestMapping("/2")
    public Exam statusReponse() {
        Exam korean = new Exam("국어", 80);
        Exam math = new Exam("수학", 90);
        Exam english = new Exam("영어", 85);
        
        return korean;

    }




}
