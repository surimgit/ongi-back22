package com.ongi.demo.common.pk;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookmarkPk {
  @Column(name = "user_id")
  private String userId;
  @Column(name = "bookmarked_post_sequence")
  private Integer bookmarkedPostSequence;  
}
