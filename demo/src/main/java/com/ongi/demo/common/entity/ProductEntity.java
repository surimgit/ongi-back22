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

@Entity(name = "product")
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer sequence;
  private String name;
  private String sellerId;
  private Integer price;
  private String category;
  private String content;
  private Integer sellingAmount;
  private Integer boughtAmount;
  private Integer purchasedPeople;
  private String deadline;
  private boolean isSoldOut;
  private Integer adPayment;
  private String reserveDate;
}
