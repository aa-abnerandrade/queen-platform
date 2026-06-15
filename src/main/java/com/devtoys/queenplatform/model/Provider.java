package com.devtoys.queenplatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Provider {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;
  private TypeProvider typeProvider;
  private CategoryProvider categoryProvider;


  public Provider(Long id, String name, String description, TypeProvider typeProvider, CategoryProvider categoryProvider) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.typeProvider = typeProvider;
    this.categoryProvider = categoryProvider;
  }


}
