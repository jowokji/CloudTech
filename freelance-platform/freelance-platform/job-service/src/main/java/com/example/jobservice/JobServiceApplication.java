package com.example.jobservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableCaching
@EnableRabbit
@OpenAPIDefinition(info = @Info(title = "Job Service API", version = "v1"))
public class JobServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(JobServiceApplication.class, args);
  }
}
