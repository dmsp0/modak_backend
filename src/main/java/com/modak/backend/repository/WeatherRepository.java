package com.modak.backend.repository;

import com.modak.backend.dto.WeatherDto;
import com.modak.backend.entity.WeatherEntity;
import com.modak.backend.entity.embeddable.WeatherId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface WeatherRepository extends JpaRepository<WeatherEntity, WeatherId> {


}

