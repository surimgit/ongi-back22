package com.ongi.demo.common.pk;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WishListPk {
  @Column(name = "user_id")
  private String userId;
  @Column(name = "product_sequence")
  private Integer productSequence;
}
