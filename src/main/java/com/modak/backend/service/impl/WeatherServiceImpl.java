package com.modak.backend.service.impl;

import com.modak.backend.constant.GeoLocation;
import com.modak.backend.dto.WeatherDto;
import com.modak.backend.entity.WeatherEntity;
import com.modak.backend.entity.embeddable.WeatherId;
import com.modak.backend.repository.WeatherRepository;
import com.modak.backend.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private final WeatherRepository weatherRepository;

    @Override
    public void register(WeatherDto weatherDto) {
        WeatherEntity weatherEntity = dtoToEntity(weatherDto);
        weatherRepository.save(weatherEntity);
    }

    @Override
    public void clear() {
        weatherRepository.deleteAllInBatch();
    }

    @Override
    public void modifyCurrentWeather(WeatherDto weatherDto) {
        WeatherId weatherId = new WeatherId(weatherDto.getRegion(), weatherDto.getDate());
        WeatherEntity weatherEntity = weatherRepository.findById(weatherId).orElseThrow();

        weatherEntity.setWeather(weatherDto.getWeather());
        weatherEntity.setTemp(Math.round(weatherDto.getTemp()) + "℃");
    }

    @Override
    public void deletePastWeather() {
        List<GeoLocation> locations = GeoLocation.getGeoList();
        List<WeatherId> weatherIdList = new ArrayList<>();

        for (GeoLocation location : locations) {
            WeatherId weatherId = new WeatherId(location.getRegion(), LocalDate.now().minusDays(1));
            weatherIdList.add(weatherId);
        }
        weatherRepository.deleteAllByIdInBatch(weatherIdList);

    }

    private WeatherEntity dtoToEntity(WeatherDto weatherDto){
        WeatherId weatherId = new WeatherId(weatherDto.getRegion(), weatherDto.getDate());
        WeatherEntity currentWeather = WeatherEntity.builder()
                .weatherId(weatherId)
                .weather(weatherDto.getWeather())
                .highTemp(Math.round(weatherDto.getHighTemp()) + "℃")
                .lowTemp(Math.round(weatherDto.getLowTemp()) + "℃")
                .build();

        return currentWeather;
    }
}
