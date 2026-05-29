package com.devtoys.queenplatform.repository;

import com.devtoys.queenplatform.model.Offering;

import java.util.List;

public class OfferingRepository {

  public List<Offering> findAll() {
    return List.of(
        new Offering(1L, "Service 1", "Description of Service 1"),
        new Offering(2L, "Service 2", "Description of Service 2"),
        new Offering(3L, "Service 3", "Description of Service 3")
    );
  }
}
