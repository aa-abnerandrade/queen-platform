package com.devtoys.queenplatform.controller;

import com.devtoys.queenplatform.model.Offering;
import com.devtoys.queenplatform.model.Provider;
import com.devtoys.queenplatform.service.ProviderService;
import com.devtoys.queenplatform.dto.ProviderDto;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/providers")
@AllArgsConstructor
public class ProviderController {
  private final ProviderService providerService;

  @GetMapping("/all")
  public ResponseEntity<List<ProviderDto>> getAllProviders() {
    List<ProviderDto> providers = providerService.getAllProviders();
    return ResponseEntity.ok().body(providers);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Provider> getProviderById(@PathVariable Long id) {
    Provider provider = providerService.getProviderById(id);
    return ResponseEntity.ok().body(provider);
  }

  @GetMapping("/{providerId}/offerings")
  public ResponseEntity<List<Offering>> getOfferingsByProviderId(@PathVariable Long providerId) {
    List<Offering> providerOfferings = providerService.getOfferingsByProviderId(providerId);
    return ResponseEntity.ok().body(providerOfferings);
  }
}
