package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Provider;
import com.devtoys.queenplatform.repository.ProviderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {
  private final ProviderRepository providerRepository;

  public ProviderService(ProviderRepository providerRepository) {
    this.providerRepository = providerRepository;
  }

  public List<Provider> getAllProviders() {
    return providerRepository.findAll();
  }

}
