package com.devtoys.queenplatform.dto;

import com.devtoys.queenplatform.model.CategoryProvider;
import com.devtoys.queenplatform.model.TypeProvider;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProviderDto {
  private Long id;
  private String name;
  private String description;
  private TypeProvider typeProvider;
  private CategoryProvider categoryProvider;
}
