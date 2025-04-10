package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "message")
@Table(name = "message")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageEntity {
  @Id
  private Integer messageSequence;
  private Integer chatSequence;
  private String content;
  private String charDate;
  private String fileUrl;
  private boolean idHelper;
}
