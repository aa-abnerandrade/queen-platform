package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Customer;
import com.devtoys.queenplatform.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
  private final CustomerRepository customerRepository;

  public Customer createCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  public Customer getCustomerById(Long id) {
    return customerRepository.findById(id).orElse(null);
  }

  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  public Customer updateCustomer(Long id, Customer customer) {
    Customer existingCustomer = customerRepository.findById(id).orElse(null);
    if (existingCustomer == null) {
      return null;
    }
    existingCustomer.setName(customer.getName());
    existingCustomer.setEmail(customer.getEmail());
    return customerRepository.save(existingCustomer);
  }

  public void deleteCustomer(Long id) {
    customerRepository.deleteById(id);
  }

}
