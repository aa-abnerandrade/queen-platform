package com.devtoys.queenplatform.model;

public class Provider {

  private Long id;
  private String name;
  private String description;
  private Address address;
  private Contact contact;
  private CategoryProvider categoryProvider;

  public Provider(Long id, String name, String description, Address address, Contact contact, CategoryProvider categoryProvider) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.address = address;
    this.contact = contact;
  }

}
