package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Offering;
import com.devtoys.queenplatform.repository.OfferingRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferingService {
  private final OfferingRepository offeringRepository;

  public OfferingService(OfferingRepository offeringRepository) {
    this.offeringRepository = offeringRepository;
  }

  public List<Offering> getAllOfferings() {
    return this.offeringRepository.findAll();
  }
}
