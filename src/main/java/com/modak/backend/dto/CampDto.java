package com.modak.backend.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CampDto {
    private Long campNo;
    private String name;
    private String address;
    private String phone;
    private String lineIntro;
    private String intro;
    private double lat;
    private double lon;
    private String region;
    private String homePage;

    @Builder.Default
    private List<String> types = new ArrayList<>();

    @Builder.Default
    private List<String> imgNames = new ArrayList<>();

    @Builder.Default
    private List<String> facilities = new ArrayList<>();


}
