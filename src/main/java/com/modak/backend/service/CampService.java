package com.modak.backend.service;

import com.modak.backend.dto.CampDto;
import com.modak.backend.dto.PageRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CampService {
    public Long register(CampDto campDto);
    public long clear();

    public CampDto get(Long campNo);
  public List<CampDto> getBest4(List<String> regions);
  public List<CampDto> getBest4(String region);

  public List<CampDto> getList(PageRequestDto pageRequestDto);
}
