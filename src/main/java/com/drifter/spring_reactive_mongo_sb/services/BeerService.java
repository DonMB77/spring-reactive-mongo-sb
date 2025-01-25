package com.drifter.spring_reactive_mongo_sb.services;

import com.drifter.spring_reactive_mongo_sb.domain.Beer;
import com.drifter.spring_reactive_mongo_sb.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BeerService {

    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO);

    Mono<BeerDTO> getById(String beerId);

    Flux<BeerDTO> listBeers();

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);

    Mono<BeerDTO> updateBeer(String beerId, BeerDTO beerDTO);

    Mono<Void> deleteBeerById(String beerId);

    Mono<BeerDTO> findFirstByBeerName(String beerName);

}
