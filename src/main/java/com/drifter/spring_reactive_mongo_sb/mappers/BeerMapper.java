package com.drifter.spring_reactive_mongo_sb.mappers;

import com.drifter.spring_reactive_mongo_sb.domain.Beer;
import com.drifter.spring_reactive_mongo_sb.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
