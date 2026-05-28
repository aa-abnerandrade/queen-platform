package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Service;
import com.devtoys.queenplatform.repository.ServiceRepository;

import java.util.List;

public class ServiceService {

  private ServiceRepository serviceRepository;

  public ServiceService(ServiceRepository serviceRepository) {
    this.serviceRepository = serviceRepository;
  }

  public List<Service> getAllServices() {
    return this.serviceRepository.findAll();
  }
}
