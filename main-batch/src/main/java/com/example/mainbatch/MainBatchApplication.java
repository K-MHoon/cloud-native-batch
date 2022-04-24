package com.example.mainbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableBatchProcessing
@EnableRetry
@EnableDiscoveryClient(autoRegister = false)
public class MainBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainBatchApplication.class, args);
    }
}
