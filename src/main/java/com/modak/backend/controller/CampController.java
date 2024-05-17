package com.modak.backend.controller;

import com.modak.backend.dto.CampDto;
import com.modak.backend.service.CampService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/camp")
public class CampController {
    private final CampService campService;
    @GetMapping("/best")
    public List<CampDto> mainBest(LocalDate date){
        List<CampDto> campDtoList = null;
        //차후 수정
        List<String> regions = new ArrayList<>();
        regions.add("경기도");
        regions.add("경상북도");


        return campDtoList;
    }

}
