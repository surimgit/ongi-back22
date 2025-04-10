package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "liked_keyword")
@Table(name = "liked_keyword")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LikedKeywordEntity {
  @Id
  private String userId;
  @Id
  private String keyword;
}
