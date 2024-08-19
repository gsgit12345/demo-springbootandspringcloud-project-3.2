package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppDiscoveryServiceApplication.class, args);
    }

    /*
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("service1", r -> r.path("/service1/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://SERVICE-NAME1"))
                .route("service2", r -> r.path("/service2/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://SERVICE-NAME2"))
                .build();
    }
*/

}
