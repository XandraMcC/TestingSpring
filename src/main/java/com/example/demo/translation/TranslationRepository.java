package com.example.demo.translation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationRepository extends MongoRepository<Translation, String> {
	
}


