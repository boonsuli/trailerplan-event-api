package com.trailerplan.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.trailerplan"})
public class TrailerplanEventApiApp
{
    public static void main( String[] args ) {
        SpringApplication.run(TrailerplanEventApiApp.class, args);
    }
}
