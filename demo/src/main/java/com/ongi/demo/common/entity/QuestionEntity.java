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

@Entity(name = "question")
@Table(name = "question")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer QuestionSequence;
  private String userId;
  private String postDate;
  private String title;
  private String category;
  private String content;
  private String answer;
  private boolean isAnswered;
}
