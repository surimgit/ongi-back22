package com.ongi.demo.common.entity;

import com.ongi.demo.common.pk.BadgePk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "badge")
@Table(name = "badge")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(BadgePk.class)
public class BadgeEntity {
  @Id
  private String userId;
  @Id
  private String badge;
}
