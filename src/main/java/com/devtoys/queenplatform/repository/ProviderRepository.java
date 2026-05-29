package com.devtoys.queenplatform.repository;

import com.devtoys.queenplatform.model.Provider;

import java.util.List;

public class ProviderRepository {

  public ProviderRepository(ProviderRepository providerRepository) {}

  public List<Provider> findAll() {
    return List.of(
        new Provider(1L, "Provider 1", "Description of Provider 1"),
        new Provider(2L, "Provider 2", "Description of Provider 2"),
        new Provider(3L, "Provider 3", "Description of Provider 3")
    );
  }
}
