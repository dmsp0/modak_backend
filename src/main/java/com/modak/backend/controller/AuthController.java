package com.modak.backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.modak.backend.dto.request.auth.IdCheckRequestDto;
import com.modak.backend.dto.request.auth.IdCheckResponseDto;
import com.modak.backend.service.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/id-check")
    public ResponseEntity<? super IdCheckResponseDto> idCheck( 
        @RequestBody @Valid IdCheckRequestDto requestBody){
            ResponseEntity<? super IdCheckResponseDto>  response = authService.idCheck(requestBody);
            return response;
        }
    }
    

