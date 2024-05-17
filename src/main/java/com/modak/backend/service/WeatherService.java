package com.modak.backend.service;


import com.modak.backend.dto.WeatherDto;
import com.modak.backend.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface WeatherService {
    public void register(WeatherDto weatherDto);
    public void clear();
    public void modifyCurrentWeather(WeatherDto weatherDto);
    public void deletePastWeather();

}

