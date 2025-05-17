package com.mcp.look_around;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthCheckController {

    @GetMapping(path = "/")
    public String healthCheck() {
        log.info("healthCheck info log!!!");
        log.debug("healthCheck debug log!!!");
        log.error("healthCheck error log!!!");
        return "OK";
    }
}
