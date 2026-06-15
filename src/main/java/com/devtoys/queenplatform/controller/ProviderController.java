package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.model.Provider;
import com.devtoys.queenplatform.service.ProviderService;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/providers")
public class ProviderController {

  private final ProviderService providerService;

  public ProviderController(ProviderService providerService) {
    this.providerService = providerService;
  }

  @GetMapping("/all")
  public ResponseEntity<List<Provider>> getAllProviders() {
    List<Provider> providers = providerService.getAllProviders();
    return ResponseEntity.ok().body(providers);
  }
}
