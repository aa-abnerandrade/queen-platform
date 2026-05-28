package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.model.Service;
import com.devtoys.queenplatform.service.ServiceService;
import org.springframework.http.ResponseEntity;

import java.net.http.HttpResponse;
import java.util.List;

public class ServiceController {

  private ServiceService serviceService;

  public ServiceController(ServiceService serviceService) {
    this.serviceService = serviceService;
  }

  public ResponseEntity<List<Service>> getAllServices() {
    List<Service> services = serviceService.getAllServices();
    return ResponseEntity.ok(services);
  }


}
