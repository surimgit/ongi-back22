package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "shopping_cart")
@Table(name = "shopping_cart")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer shoppingCartSequence;
  private String userId; 
  private Integer productSequence;
  private Integer quantity;
  private String addedDate;
}
