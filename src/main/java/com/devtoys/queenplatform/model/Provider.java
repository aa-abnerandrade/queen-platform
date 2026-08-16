package com.devtoys.queenplatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor
public class Provider {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  private String description;

  @Enumerated(EnumType.STRING)
  private TypeProvider typeProvider;

  @ManyToOne
  @JoinColumn(name = "category_provider_id")
  private CategoryProvider categoryProvider;

  @OneToMany(mappedBy = "provider")
  @JsonManagedReference
  private List<Offering> offerings;


  public Provider() {
    this.offerings = new ArrayList<>();
  }

  public Provider(String name, String description, TypeProvider typeProvider, CategoryProvider categoryProvider) {
    this.name = name;
    this.description = description;
    this.typeProvider = typeProvider;
    this.categoryProvider = categoryProvider;
    this.offerings = new ArrayList<>();
  }

}
