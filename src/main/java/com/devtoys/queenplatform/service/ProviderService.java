package com.devtoys.queenplatform.service;

import com.devtoys.queenplatform.model.Offering;
import com.devtoys.queenplatform.model.Provider;
import com.devtoys.queenplatform.repository.ProviderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProviderService {
  private final ProviderRepository providerRepository;

  public List<Provider> getAllProviders() {
    return providerRepository.findAll();
  }

  public Provider getProviderById(Long id) {
    return providerRepository.findById(id).orElse(null);
  }

  public List<Offering> getOfferingsByProviderId(Long providerId) {
    Provider provider = getProviderById(providerId);
    if (provider != null) {
      return provider.getOfferings();
    } else {
      return null;
    }
  }
}
