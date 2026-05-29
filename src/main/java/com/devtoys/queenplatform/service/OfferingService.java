package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Offering;
import com.devtoys.queenplatform.repository.OfferingRepository;

import java.util.List;

public class OfferingService {
  private OfferingRepository offeringRepository;

  public OfferingService(OfferingRepository offeringRepository) {
    this.offeringRepository = offeringRepository;
  }

  public List<Offering> getAllServices() {
    return this.offeringRepository.findAll();
  }
}
