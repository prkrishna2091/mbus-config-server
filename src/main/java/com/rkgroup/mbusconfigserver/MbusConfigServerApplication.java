package com.rkgroup.mbusconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MbusConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbusConfigServerApplication.class, args);
    }

}
