package com.eunbi.springtest.ajax;

import com.eunbi.springtest.ajax.domain.Favorites;
import com.eunbi.springtest.ajax.service.FavoriteService;
import com.eunbi.springtest.mybatis.test01.repository.RealEstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/ajax/favorites")
@Controller
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;
    @Autowired
    private RealEstateRepository realEstateRepository;

    @GetMapping("/list")
    public String favoriteList(Model model) {

        List<Favorites> favoriteList = favoriteService.getFavoriteList();

        model.addAttribute("favoriteList", favoriteList);

        return "ajax/list";
    }



    // 특정한 하나의 즐겨찾기 삭제 API
    @ResponseBody
    @GetMapping("/remove")
    public Map<String, String> removeFavorite(@RequestParam("id") int id) {

        int count = favoriteService.deleteFavorite(id);

        Map<String, String> resultMap = new HashMap<>();
        // 성공 : {"result":"success"}
        // 실패 : {"result":"fail"}

        if(count == 1) {
            resultMap.put("result", "success");
        } else {
            resultMap.put("result", "fail");
        }

        return resultMap;

    }



    // 사이트 이름, 주소를 전달 받고, 저장하는 API
    @ResponseBody
    @PostMapping("/add")
    public Map<String, String> addFavorite(
            @RequestParam("name") String name
            , @RequestParam("url") String url) {

        int count = favoriteService.createFavorite(name, url);

        Map<String, String> resultMap = new HashMap<>();
        // 성공 : {"result":"success"}
        // 실패 : {"result":"fail"}

        if(count == 1) {
            resultMap.put("result", "success");
        } else {
            resultMap.put("result", "fail");
        }

        return resultMap;
    }

    @GetMapping("/form")
    public String favoriteForm() {

        return "ajax/form";
    }

    @ResponseBody
    @PostMapping("/duplicate-url")
    public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url) {

        Map<String, Boolean> resultMap = new HashMap<>();

//        if (favoriteService.isDuplicateUrl(url)) {
//            resultMap.put("isDuplicate", true);
//        } else {
//            resultMap.put("isDuplicate", false);
//        }

        resultMap.put("isDuplicate", favoriteService.isDuplicateUrl(url));

        return resultMap;
    }




}
