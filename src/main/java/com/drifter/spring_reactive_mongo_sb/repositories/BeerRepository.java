package com.drifter.spring_reactive_mongo_sb.repositories;

import com.drifter.spring_reactive_mongo_sb.domain.Beer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface BeerRepository extends ReactiveMongoRepository<Beer, String> {

    Mono<Beer> findFirstByBeerName(String beerName);
}
