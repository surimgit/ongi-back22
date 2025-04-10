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

@Entity(name = "user_review")
@Table(name = "user_review")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserReviewEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer reviewSequence;
  private Integer reviewedPostSequence;
  private String writerId;
  private String reviewedId;
  private String reviewType;
  private String postDate;
  private double rating;
  private String content;
}
