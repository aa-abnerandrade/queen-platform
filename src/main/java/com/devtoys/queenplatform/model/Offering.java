package com.devtoys.queenplatform.model;

public class Offering {

  private Long id;
  private String name;
  private String description;
  private CategoryProvider categoryProvider;


  public Offering(Long id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }
}
