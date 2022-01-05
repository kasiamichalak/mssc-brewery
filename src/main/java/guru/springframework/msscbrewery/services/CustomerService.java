package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by km on 2022-01-05.
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
