package com.jane.distribution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DistributionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistributionApplication.class, args);
    }

}
