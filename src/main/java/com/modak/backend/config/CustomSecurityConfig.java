// package com.modak.backend.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.stereotype.Component;

// import lombok.RequiredArgsConstructor;
// import lombok.extern.log4j.Log4j2;

// @Component
// @Log4j2
// @RequiredArgsConstructor
// public class CustomSecurityConfig {
//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         log.info("*******   security config *********" + http);
//         return http.build();
//     }
// }