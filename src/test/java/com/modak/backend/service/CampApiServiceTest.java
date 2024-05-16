package com.modak.backend.service;

import com.modak.backend.dto.CampDto;
import lombok.extern.log4j.Log4j2;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class CampApiServiceTest {
    @Autowired
    CampApiService campApiService;

//    @Test
//    void getCampTotalCount() {
//        log.info(campApiService.getCampTotalCount());
//    }

    @Test
    void registerByApi(){
        campApiService.registerByApi();
    }

}