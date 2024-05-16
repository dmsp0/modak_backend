package com.modak.backend.entity.embeddable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class WeatherId implements Serializable {
    private String region;
    private LocalDate date;
}
