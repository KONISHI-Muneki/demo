package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"id"})
public class Person {
  @Id
  private String id;

  private String name;

  private String location;

  private String birthDate;
}
