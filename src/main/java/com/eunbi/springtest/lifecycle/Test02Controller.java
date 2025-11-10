package com.eunbi.springtest.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RequestMapping("/lifecycle/test02")
@RestController
public class Test02Controller {
    @RequestMapping("/1")
    public List<Map<String, Object>> movieList() {

        List<Map<String, Object>> movieList = new ArrayList<>();

        Map<String, Object> movieMap = new HashMap<>();
        movieMap.put("title", "기생충");
        movieMap.put("director", "봉준호");
        movieMap.put("time", 131);
        movieMap.put("rate", 15);

        movieList.add(movieMap);

        movieMap.put("title", "인생은 아름다워");
        movieMap.put("director", "로베르토 베니니");
        movieMap.put("time", 116);
        movieMap.put("rate", 0);

        movieList.add(movieMap);

        movieMap.put("title", "인셉션");
        movieMap.put("director", "크리스토퍼 놀란");
        movieMap.put("time", 147);
        movieMap.put("rate", 12);

        movieList.add(movieMap);

        movieMap.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
        movieMap.put("director", "윤종빈");
        movieMap.put("time", 133);
        movieMap.put("rate", 19);

        movieList.add(movieMap);

        movieMap.put("title", "헝거게임");
        movieMap.put("director", "프란시스 로렌스");
        movieMap.put("time", 137);
        movieMap.put("rate", 15);

        movieList.add(movieMap);

        return movieList;
    }


    @RequestMapping("/2")
    public List<Post> postList() {

        List<Post> postList = new ArrayList<>();
        Post post = new Post("안녕하세요 가입 인사 드립니다.", "eunbi", "안녕하세요 가입했어요. 잘부탁 ㅅㄱ");

        postList.add(post);
        postList.add(new Post("아 912좀 처들지마라 ㅆㅂ것들아", "사짜직업", "죽여벌라~"));

        return postList;
    }


    public ResponseEntity<Post> entityResponse() {
        Post post = new Post("안녕하세요 가입 인사 드립니다", "linv", "ㅎㅇㅎㅇ ㅂㄱㅂㄱ");

        ResponseEntity<Post> postEntity = new ResponseEntity<>(post, HttpStatus.INTERNAL_SERVER_ERROR);

        return postEntity;
    }


}
