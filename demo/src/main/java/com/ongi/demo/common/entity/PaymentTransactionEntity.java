package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "payment_transaction")
@Table(name = "payment_transaction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentTransactionEntity {
  @Id
  private String transactionKey;
  private String paymentKey;
  private String type;
  private String status;
  private Integer amount;
  private String transactionTime;
}
