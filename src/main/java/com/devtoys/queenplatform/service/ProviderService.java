package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Provider;
import com.devtoys.queenplatform.repository.ProviderRepository;

import java.util.List;

public class ProviderService {
  private ProviderRepository providerRepository;

  public ProviderService(ProviderRepository providerRepository) {
    this.providerRepository = providerRepository;
  }

  public List<Provider> getAllProviders() {
    return providerRepository.findAll();
  }

}
