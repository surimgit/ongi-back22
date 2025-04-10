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

@Entity(name = "event")
@Table(name = "event")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventSequenceEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer eventSequence;
  private String title;
  private String deadline;
  private Integer neededPoint;
  private String content;
  private String image;
}
