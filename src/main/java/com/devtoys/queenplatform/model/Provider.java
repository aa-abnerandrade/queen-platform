package com.devtoys.queenplatform.model;


public class Provider {

  private Long id;
  private String name;
  private String description;
  private TypeProvider typeProvider;
  private CategoryProvider categoryProvider;

  public Provider(long id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public Provider(Long id, String name, String description, CategoryProvider categoryProvider) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.categoryProvider = categoryProvider;
  }


}
