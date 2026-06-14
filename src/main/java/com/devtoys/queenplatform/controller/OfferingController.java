package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.model.Offering;
import com.devtoys.queenplatform.service.OfferingService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OfferingController {

  private final OfferingService offeringService;

  public OfferingController(OfferingService offeringService) {
    this.offeringService = offeringService;
  }

  public ResponseEntity<List<Offering>> getAllServices() {
    List<Offering> offerings = offeringService.getAllServices();
    return ResponseEntity.ok(offerings);
  }


}
