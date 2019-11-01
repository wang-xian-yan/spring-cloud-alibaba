package org.yan.sca.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangx
 */
@RestController
@RequestMapping("/api/v1/")
@Slf4j
public class IndexController {

    @GetMapping("/index")
    public ResponseEntity<?> index() {
        log.info("[index] begin spring cloud alibaba");
        return ResponseEntity.ok("Hello Spring Cloud Alibaba");
    }
}
