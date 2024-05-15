package com.modak.backend.repository;

import com.modak.backend.entity.WeatherEntity;
import com.modak.backend.entity.embeddable.WeatherId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<WeatherEntity, WeatherId> {
}
