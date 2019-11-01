package org.yan.sca.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangx
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ShowcaseProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowcaseProviderApplication.class, args);
    }

}
