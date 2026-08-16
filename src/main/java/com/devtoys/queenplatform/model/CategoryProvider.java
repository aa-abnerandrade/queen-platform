package com.devtoys.queenplatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryProvider {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String nameCategoryProvider;

  private String descriptionCategoryProvider;

}
