package org.yan.sca.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangx
 * @date 11/01/2019 14:34
 */
@RestController
@RequestMapping("/api/v1/")
public class IndexController {
    @Autowired
    private RestTemplate restTemplate;



    @GetMapping("/hello")
    @SentinelResource("/hello-limiting")
    public ResponseEntity<?> hello(){
        return restTemplate.getForEntity("http://showcase-provider/api/v1/index",String.class);
    }
}
