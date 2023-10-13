package com.jos.dem.springboot.flyway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Person {

  @Id
  @GeneratedValue(strategy = AUTO)
  Long id;

  @Column(nullable = false)
  String firstname;

  @Column(nullable = false)
  String lastname;
  @Column(nullable = false)
  String mobile;
}
