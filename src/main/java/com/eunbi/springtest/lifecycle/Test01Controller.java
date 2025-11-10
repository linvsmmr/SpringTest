package com.eunbi.springtest.lifecycle;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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

    @ResponseBody
    @RequestMapping("/2")
    public Map<String,Integer> mapResponse() {
        Map<String,Integer> scoreMap = new HashMap<>();

        scoreMap.put("국어", 80);
        scoreMap.put("수학", 90);
        scoreMap.put("영어", 85);

        return scoreMap;
    }


}
