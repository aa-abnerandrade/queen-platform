package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Customer;
import com.devtoys.queenplatform.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
  private final CustomerRepository customerRepository;

  public Customer getCustomerById(Long id) {
    return customerRepository.findById(id).orElse(null);
  }
}
