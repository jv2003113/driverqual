package com.ehi.driverqual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DqApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DqApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting DQ application:");
        System.out.println("-------------------------------");
    }
}
