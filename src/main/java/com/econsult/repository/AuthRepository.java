package com.econsult.repository;

import com.econsult.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthRepository extends MongoRepository<Login, String> {
}
