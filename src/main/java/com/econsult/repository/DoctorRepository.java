package com.econsult.repository;

import com.econsult.model.Consultation;
import com.econsult.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {

}
