package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller just to check that service is running fine
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "HOME-ZUUL";
    }
}
