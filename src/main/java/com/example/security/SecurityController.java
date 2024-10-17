package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class SecurityController {

    @GetMapping("/api/data")
    public Map<String, String> getData() {
        return Collections.singletonMap("message", "Hello, secure world!");
    }
}