package com.drifter.spring_reactive_mongo_sb.repositories;

import com.drifter.spring_reactive_mongo_sb.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository  extends ReactiveMongoRepository<Customer, String> {
}
