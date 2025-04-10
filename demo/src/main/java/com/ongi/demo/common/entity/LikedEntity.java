package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "liked")
@Table(name = "liked")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LikedEntity {
  @Id
  private String userId;
  @Id
  private Integer likedPostSequence;
}
