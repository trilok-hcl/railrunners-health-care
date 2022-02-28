package com.econsult.repository;

import com.econsult.model.Consultation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends MongoRepository<Consultation, String> {
}
