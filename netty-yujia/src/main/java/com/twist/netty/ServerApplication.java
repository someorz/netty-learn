package com.twist.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: ${description}
 * @author: chenyingjie
 * @create: 2019-01-04 15:50
 **/
@SpringBootApplication
@ComponentScan("com.twist.netty.server")
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class);
    }
}
