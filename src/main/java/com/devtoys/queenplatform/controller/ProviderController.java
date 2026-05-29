package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.model.Provider;
import com.devtoys.queenplatform.service.ProviderService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ProviderController {

  private ProviderService providerService;

  public ProviderController(ProviderService providerService) {
    this.providerService = providerService;
  }

  public ResponseEntity<List<Provider>> getAllProviders() {
    List<Provider> providers = providerService.getAllProviders();
    return ResponseEntity.ok().body(providers);
  }
}
