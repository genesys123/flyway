package com.jos.dem.springboot.flyway;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class FlywayApplicationTest {

  private final ApplicationContext applicationContext;

  @Test
  @DisplayName("validating application context")
  void shouldValidateContext(TestInfo testInfo) {
    log.info("Running: {}", testInfo.getDisplayName());
    assertNotNull(applicationContext, "should have an application context");
  }
}
