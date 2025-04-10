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

@Entity(name = "community_comment")
@Table(name = "community_comment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommunityCommentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer commentSequence;
  private Integer postSequence;
  private String userId;
  private String content;
  private String postDate;
}
