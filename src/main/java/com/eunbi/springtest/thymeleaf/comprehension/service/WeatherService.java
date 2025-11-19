package com.eunbi.springtest.thymeleaf.comprehension.service;

import com.eunbi.springtest.store.domain.Store;
import com.eunbi.springtest.store.repository.StoreRepository;
import com.eunbi.springtest.thymeleaf.comprehension.domain.Weather;
import com.eunbi.springtest.thymeleaf.comprehension.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    public List<Weather> getWeather() {
        List<Weather> weatherList = weatherRepository.selectWeatherInfo();
        return weatherList;
    }


}
