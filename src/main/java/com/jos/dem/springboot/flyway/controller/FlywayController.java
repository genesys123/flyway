package com.jos.dem.springboot.flyway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlywayController {

  @GetMapping("/")
  public String index() {
    return "Hello Flyway!";
  }
}
