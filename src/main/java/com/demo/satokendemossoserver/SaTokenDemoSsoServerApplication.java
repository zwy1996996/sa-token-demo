package com.demo.satokendemossoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaTokenDemoSsoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaTokenDemoSsoServerApplication.class, args);
        System.out.println("\nSa-Token SSO模式一 Client端启动成功");
    }

}
