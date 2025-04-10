package com.ongi.demo.common.entity;

import com.ongi.demo.common.pk.BookmarkPk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "bookmark")
@Table(name = "bookmark")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(BookmarkPk.class)
public class BookmarkEntity {
  
  @Id
  private String userId;
  @Id
  private Integer bookmarkedPostSequence;
}
