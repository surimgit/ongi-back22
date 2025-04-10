package com.ongi.demo.common.entity;

import com.ongi.demo.common.pk.WishListPk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "wish_list")
@Table(name = "wish_list")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(WishListPk.class)
public class WishListEntity {
  @Id
  private String userId;
  @Id
  private Integer productSequence;
}
