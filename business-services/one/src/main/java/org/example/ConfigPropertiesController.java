package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller just to check that service is running fine
 */
@RestController
public class ConfigPropertiesController {

    @GetMapping("/test-one")
    public String getPropertyValue() {
        return "test-one";
    }
}
