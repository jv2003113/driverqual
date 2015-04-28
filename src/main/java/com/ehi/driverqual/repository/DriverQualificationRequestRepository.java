package com.ehi.driverqual.repository;

import com.ehi.driverqual.domain.DriverQualificationRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DriverQualificationRequestRepository extends MongoRepository<DriverQualificationRequest, String> {
    public DriverQualificationRequest findById(String id);

}