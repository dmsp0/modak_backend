package com.modak.backend.repository;

import com.modak.backend.dtointerface.CampInterface;
import com.modak.backend.entity.CampEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CampRepositoryTest {
    @Autowired
    CampRepository campRepository;

    @Test
    void getCampEntitiesByRegionIn() {
        List<String> region = new ArrayList<>();
        region.add("강원도");
        region.add("서울시");
        region.add("경기도");
        List<CampInterface> campEntity = campRepository.selectBestFourByBestRegions(region);

        for (CampInterface entity : campEntity) {
            System.out.println(entity.getCampNo());
            System.out.println(entity.getName());
            System.out.println(entity.getAddress());
            System.out.println(entity.getImgName());
        }
    }

    @Test
    void getList(){
        Pageable pageable = PageRequest.of(0,10);
        Page<CampEntity> campEntityList = campRepository.getList(pageable, "자동차야영장","강원도","캠핑");
        List<CampEntity> campEntities = campEntityList.getContent();

        for (CampEntity campEntity : campEntities) {
            System.out.println(campEntity);
            System.out.println(campEntity.getCampTypes());
        }
    }
}