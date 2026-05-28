package com.devtoys.queenplatform.repository;

import com.devtoys.queenplatform.model.Service;

import java.util.List;

public class ServiceRepository {

  public List<Service> findAll() {
    return List.of(
        new Service(1L, "Service 1", "Description of Service 1"),
        new Service(2L, "Service 2", "Description of Service 2"),
        new Service(3L, "Service 3", "Description of Service 3")
    );
  }
}
