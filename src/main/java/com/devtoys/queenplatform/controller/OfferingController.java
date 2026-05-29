package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.model.Offering;
import com.devtoys.queenplatform.service.OfferingService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class OfferingController {

  private OfferingService offeringService;

  public OfferingController(OfferingService offeringService) {
    this.offeringService = offeringService;
  }

  public ResponseEntity<List<Offering>> getAllServices() {
    List<Offering> offerings = offeringService.getAllServices();
    return ResponseEntity.ok(offerings);
  }


}
