package com.devtoys.queenplatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
public class Offering {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;

  @ManyToOne
  @JoinColumn(name = "category_offering_id")
  private CategoryOffering categoryOffering;

  @ManyToOne
  @JoinColumn(name = "provider_id")
  private Provider provider;

  public Offering() {}

}
