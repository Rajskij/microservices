package example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller just to check that service is running fine
 */
@RestController
public class ConfigPropertiesController {

    @GetMapping("/test-two")
    public String getPropertyValue() {
        return "test-two";
    }
}
