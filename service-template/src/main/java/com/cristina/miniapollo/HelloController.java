package com.cristina.miniapollo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Mini Apollo!";
    }

    @GetMapping("/fail")
    public String fail() {
        throw new RuntimeException("Something went wrong!");
    }

}
