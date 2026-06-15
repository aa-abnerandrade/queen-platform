package com.devtoys.queenplatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Offering {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;
  private CategoryOffering categoryOffering;
  private Provider provider;


  public Offering(Long id, String name, String description, CategoryOffering categoryOffering, Provider provider) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.categoryOffering = categoryOffering;
    this.provider = provider;
  }


}
