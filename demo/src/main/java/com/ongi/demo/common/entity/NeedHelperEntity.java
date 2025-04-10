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

@Entity(name = "need_helper")
@Table(name = "need_helper")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NeedHelperEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer sequence;
  private String reward;
  private String userId;
  private String title;
  private String content;
  private String date;
  private String location;
  private String category;
  private boolean isRequestSolved;
}
