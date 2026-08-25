package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.model.Customer;
import com.devtoys.queenplatform.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {
  private final CustomerService customerService;

  public ResponseEntity<Customer> getCustomerById(Long id) {
    Customer customer = customerService.getCustomerById(id);
    return ResponseEntity.ok().body(customer);
  }

}
