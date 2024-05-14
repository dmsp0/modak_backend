package com.modak.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modak.backend.entity.CertificationEntity;

@Repository
public interface CertificationRepository extends JpaRepository<CertificationRepository, String>{
    
}
