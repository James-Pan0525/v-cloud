package com.pwl.vcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class VcloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(VcloudConfigApplication.class, args);
    }

}
