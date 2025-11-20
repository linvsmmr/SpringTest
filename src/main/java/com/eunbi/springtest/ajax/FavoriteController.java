package com.eunbi.springtest.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/favorites")
@Controller
public class FavoriteController {

    @GetMapping("/add")
    public String addFavoritesAPI() {
        return "ajax/test01";
    }
}
