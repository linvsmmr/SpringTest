package com.eunbi.springtest.thymeleaf.comprehension.repository;

import com.eunbi.springtest.thymeleaf.comprehension.domain.Weather;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeatherRepository {
    public List<Weather> selectWeatherInfo();
}
