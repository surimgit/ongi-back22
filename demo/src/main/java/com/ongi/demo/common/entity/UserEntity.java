package com.ongi.demo.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user")
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
  
  @Id
  private String userId;
  private String nickname;
  private String name;
  private String address;
  private String detailAddress;
  private Integer zipCode;
  private String birth;
  private String tel_number;
  private boolean isSeller;
  private String gender;
  private String profileImage;
  private String mbti;
  private String job;
  private String selfIntro;
  private Integer userPoint;
  private boolean isAdmin;
  private boolean isResigned;

}
