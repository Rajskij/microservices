package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller just to check that service is running fine
 */
@RestController
public class TestController {

    @GetMapping("/test-eureka")
    public String test() {
        return "TEST-EUREKA";
    }
}
