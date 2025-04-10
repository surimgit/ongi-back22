package com.ongi.demo.common.pk;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadgePk {
  @Column(name = "user_id")
  private String userId;
  @Column(name = "badge")
  private String badge;
}
