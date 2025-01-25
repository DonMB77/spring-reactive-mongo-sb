package com.drifter.spring_reactive_mongo_sb.mappers;

import com.drifter.spring_reactive_mongo_sb.domain.Customer;
import com.drifter.spring_reactive_mongo_sb.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
