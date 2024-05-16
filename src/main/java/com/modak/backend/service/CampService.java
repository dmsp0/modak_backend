package com.modak.backend.service;

import com.modak.backend.dto.CampDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CampService {
    public Long register(CampDto campDto);
    public long clear();
//    public List<CampDto> getList();
//    public CampDto get(Long campNo);
//
}
