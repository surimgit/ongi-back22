package com.ongi.demo.common.pk;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikedPk {
  @Column(name = "user_id")
  private String userId;
  @Column(name = "liked_post_sequence")
  private Integer likedPostSequence;
}
