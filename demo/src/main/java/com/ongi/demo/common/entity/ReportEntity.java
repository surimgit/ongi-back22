package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "report")
@Table(name = "report")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportEntity {
  @Id
  private Integer reportSequence;
  private String reporterId;
  private Integer reportedEntityNum;
  private String reportedEntityType;
  private String reportedContent;
  private String reportedDate;
  private String reportCategory;
  private String reportDetail;
  private String reportProcess;
}
