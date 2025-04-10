package com.ongi.demo.common.entity;

import com.ongi.demo.common.pk.AttenderListPk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "attender_list")
@Table(name = "attender_list")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(AttenderListPk.class)
public class AttenderListEntity {
  @Id
  private Integer attendedEventSequence;
  @Id
  private String userId;
}
