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

@Entity(name = "community_post")
@Table(name = "community_post")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommunityPostEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer postSequence;
  private String userId;
  private String postDate;
  private String category;
  private String title;
  private String content;
  private Integer liked;
}
