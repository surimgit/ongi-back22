package com.ongi.demo.common.pk;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttenderListPk {
  @Column(name="attended_event_sequence")
  private Integer attendedEventSequence;
  @Column(name = "userId")
  private String userId;
}
