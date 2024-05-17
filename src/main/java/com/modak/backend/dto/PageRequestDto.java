package com.modak.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageRequestDto {
    private int page;
    private int size;
    private String type;
    private String region;
    private String searchTerm;
}
