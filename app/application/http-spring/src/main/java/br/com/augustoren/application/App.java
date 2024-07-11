package br.com.augustoren.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "br.com.augustoren")
@EnableFeignClients(basePackages = "br.com.augustoren")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}