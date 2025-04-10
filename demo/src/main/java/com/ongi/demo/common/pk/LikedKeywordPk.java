package com.ongi.demo.common.pk;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikedKeywordPk {
  @Column(name = "userId")
  private String userId;
  @Column(name = "keyword")
  private String keyword;
}
