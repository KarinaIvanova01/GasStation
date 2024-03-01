package com.example.gasstations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableFeignClients({"com.example.gasstations.config"})
@EnableJpaRepositories
@EntityScan
public class GasStationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GasStationsApplication.class, args);
    }

}
