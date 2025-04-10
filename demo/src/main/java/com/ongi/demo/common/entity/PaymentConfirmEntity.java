package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "payment_confirm")
@Table(name = "payment_confirm")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentConfirmEntity {
  @Id
  private String paymentKey;
  private String orderId;
  private String status;
  private String method;
  private String approvedTime;
}
