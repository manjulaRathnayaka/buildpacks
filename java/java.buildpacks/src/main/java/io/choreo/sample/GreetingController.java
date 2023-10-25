package io.choreo.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

     @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        GreetingService greetingService = new GreetingService();
        String greeting = greetingService.greet(name);

        return greeting;
    }
}
