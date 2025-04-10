package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "payment_cancel")
@Table(name = "payment_cancel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentCancelEntity {
  @Id
  private String paymentKey;
  private Integer cancelAmount;
  private String cancelReason;
  private String canceledTime;
  private String status;
}
