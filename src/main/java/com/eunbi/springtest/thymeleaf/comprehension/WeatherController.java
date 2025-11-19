package com.eunbi.springtest.thymeleaf.comprehension;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/weather")
public class WeatherController {


    @GetMapping("/01")
    public String weatherInfo() {

        return "thymeleaf/test04";
    }
}
