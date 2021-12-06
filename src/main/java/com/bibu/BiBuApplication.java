package com.bibu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bibu.*")
public class BiBuApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiBuApplication.class, args);
    }

}
