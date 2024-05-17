package com.modak.backend.repository;

import com.modak.backend.entity.WeatherEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherRepositoryTest {
    @Autowired
    WeatherRepository weatherRepository;
    @Test
    void getByWeather() {
        List<WeatherEntity> weatherEntities = weatherRepository.getByWeatherAndDate(LocalDate.now());
        for (WeatherEntity weatherEntity : weatherEntities) {
            System.out.println(weatherEntity.getWeatherId());
        }
    }
    @Test
    void getByDate() {
        List<WeatherEntity> weatherEntities = weatherRepository.getByDate(LocalDate.now());
        for (WeatherEntity weatherEntity : weatherEntities) {
            System.out.println(weatherEntity);
        }
    }
}