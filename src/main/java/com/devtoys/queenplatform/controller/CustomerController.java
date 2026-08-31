package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.dto.CustomerDto;
import com.devtoys.queenplatform.model.Customer;
import com.devtoys.queenplatform.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {
  private final CustomerService customerService;

  @PostMapping("/create")
  public ResponseEntity<URI> createCustomer(@RequestBody Customer customer) {
    Customer createdCustomer = customerService.createCustomer(customer);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(createdCustomer.getId())
        .toUri();
    return ResponseEntity.created(uri).build();
  }

  @GetMapping("/{id}")
  public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Long id) {
    Customer customer = customerService.getCustomerById(id);
    if (customer == null) {
      return ResponseEntity.notFound().build();
    }
    CustomerDto customerDto = new CustomerDto(customer.getId(), customer.getName(), customer.getEmail());
    return ResponseEntity.ok().body(customerDto);
  }

  @GetMapping("/all")
  public ResponseEntity<List<CustomerDto>> getAllCustomers() {
    List<Customer> customers = customerService.getAllCustomers();
    List<CustomerDto> customersDto = customers.stream()
        .map(c -> new CustomerDto(c.getId(), c.getName(), c.getEmail()))
        .toList();
    return ResponseEntity.ok().body(customersDto);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<CustomerDto> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
    Customer updatedCustomer = customerService.updateCustomer(id, customer);
    if (updatedCustomer == null) {
      return ResponseEntity.notFound().build();
    }
    CustomerDto customerDto = new CustomerDto(updatedCustomer.getId(), updatedCustomer.getName(), updatedCustomer.getEmail());
    return ResponseEntity.ok().body(customerDto);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
    Customer customer = customerService.getCustomerById(id);
    if (customer == null) {
      return ResponseEntity.notFound().build();
    }
    customerService.deleteCustomer(id);
    return ResponseEntity.noContent().build();
  }
}
