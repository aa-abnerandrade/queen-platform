package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Offering;
import com.devtoys.queenplatform.repository.OfferingRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OfferingService {
  private final OfferingRepository offeringRepository;

  public List<Offering> getAllOfferings() {
    return this.offeringRepository.findAll();
  }

  public Offering getOfferingById(Long id) {
    return this.offeringRepository.findById(id).orElse(null);
  }
}
