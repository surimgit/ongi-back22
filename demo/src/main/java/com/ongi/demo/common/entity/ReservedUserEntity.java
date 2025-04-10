package com.ongi.demo.common.entity;

import com.ongi.demo.common.pk.ReservedUserPk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "reserved_user")
@Table(name = "reserved_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ReservedUserPk.class)
public class ReservedUserEntity {
  @Id
  private Integer productSequence;
  @Id
  private String userId;
}
