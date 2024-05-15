package com.modak.backend.service;


import com.modak.backend.dto.WeatherDto;

public interface WeatherService {
    public void register(WeatherDto weatherDto);
    public void clear();
    public void modifyCurrentWeather(WeatherDto weatherDto);
    public void deletePastWeather();
}
