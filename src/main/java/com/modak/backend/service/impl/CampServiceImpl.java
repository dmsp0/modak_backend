package com.modak.backend.service.impl;

import com.modak.backend.dto.CampDto;
import com.modak.backend.entity.CampEntity;
import com.modak.backend.entity.embeddable.CampImg;
import com.modak.backend.repository.CampRepository;
import com.modak.backend.service.CampService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CampServiceImpl implements CampService {
    private final CampRepository campRepository;
    private final ModelMapper modelMapper;

    @Override
    public Long register(CampDto campDto) {
        CampEntity campEntity = dtoToEntity(campDto);
        CampEntity result = campRepository.save(campEntity);
        return result.getCampNo();
    }

    @Override
    public long clear() {
        long count = campRepository.count();
        campRepository.deleteAllInBatch();
        return count;
    }

    private CampEntity dtoToEntity(CampDto campDto){
        CampEntity campEntity = CampEntity.builder()
                .name(campDto.getName())
                .intro(campDto.getIntro())
                .lineIntro(campDto.getLineIntro())
                .address(campDto.getAddress())
                .region(campDto.getRegion())
                .phone(campDto.getPhone())
                .lat(campDto.getLat())
                .lon(campDto.getLon())
                .homePage(campDto.getHomePage())
                .build();

        List<String> campImgList = campDto.getImgNames();

        for (int i = 0; i < campImgList.size(); i++) {
            CampImg campImg = CampImg.builder()
                    .ord(i)
                    .imgName(campImgList.get(i))
                    .build();
            campEntity.addImg(campImg);
        }

        for (String facility : campDto.getFacilities()) {
            campEntity.addFacility(facility);
        }

        for (String type : campDto.getTypes()) {
            campEntity.addType(type);
        }

        return campEntity;
    }


}
