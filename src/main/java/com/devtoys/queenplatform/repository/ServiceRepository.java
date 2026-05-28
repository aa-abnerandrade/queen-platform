package com.devtoys.queenplatform.repository;

import com.devtoys.queenplatform.model.Service;

import java.util.List;

public class ServiceRepository {

  public List<Service> findAll() {
    return List.of(
        new Service(1, "Service 1", "Description of Service 1"),
        new Service(2, "Service 2", "Description of Service 2"),
        new Service(3, "Service 3", "Description of Service 3")
    );
  }
}
