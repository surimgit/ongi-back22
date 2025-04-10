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

@Entity(name="alert")
@Table(name="alert")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlertEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String alertSequence;
  private String senderId;
  private Integer alertEntitySequence;
  private String receiverId;
}
