package com.drifter.spring_reactive_mongo_sb.repositories;

import com.drifter.spring_reactive_mongo_sb.domain.Beer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BeerRepository extends ReactiveMongoRepository<Beer, String> {
}
