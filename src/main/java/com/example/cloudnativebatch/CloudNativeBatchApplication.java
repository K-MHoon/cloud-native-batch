package com.example.cloudnativebatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudNativeBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNativeBatchApplication.class, args);
    }

}
