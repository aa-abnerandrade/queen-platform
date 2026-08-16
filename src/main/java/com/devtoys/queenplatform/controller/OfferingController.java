package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.model.Offering;
import com.devtoys.queenplatform.service.OfferingService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/offerings")
public class OfferingController {

  private final OfferingService offeringService;

  public OfferingController(OfferingService offeringService) {
    this.offeringService = offeringService;
  }

  @GetMapping("/all")
  public ResponseEntity<List<Offering>> getAllServices() {
    List<Offering> offerings = offeringService.getAllOfferings();
    return ResponseEntity.ok(offerings);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Offering> getOfferingById(@PathVariable Long id) {
    Offering offering = offeringService.getOfferingById(id);
    return ResponseEntity.ok(offering);
  }

}
