package com.modak.backend.service;

import org.springframework.http.ResponseEntity;

import com.modak.backend.dto.request.auth.IdCheckRequestDto;
import com.modak.backend.dto.request.auth.IdCheckResponseDto;

public interface AuthService {
    ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto);
}
