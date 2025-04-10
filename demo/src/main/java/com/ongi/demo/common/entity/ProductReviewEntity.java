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

@Entity(name = "product_review")
@Table(name = "product_review")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductReviewEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer reviewSequence;
  private Integer productSequence;
  private String userId;
  private String postDate;
  private double rating;
  private String content;
  private String reviewImage;
}
