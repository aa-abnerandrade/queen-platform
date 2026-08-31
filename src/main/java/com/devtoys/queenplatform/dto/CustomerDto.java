package com.devtoys.queenplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomerDto {
  private Long id;
  private String name;
  private String email;
}
