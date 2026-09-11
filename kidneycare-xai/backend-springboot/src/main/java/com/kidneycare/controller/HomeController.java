package com.kidneycare.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> root() {
        Map<String, Object> response = new HashMap<>();
        response.put("service", "KidneyCare-XAI Spring Boot Backend REST API");
        response.put("status", "UP");
        response.put("frontendUrl", "http://localhost:3000");
        response.put("mlServiceUrl", "http://127.0.0.1:8000");
        response.put("database", "Connected (Supabase Cloud PostgreSQL)");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/api/health")
    public ResponseEntity<Map<String, Object>> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "backend-springboot");
        return ResponseEntity.ok(response);
    }
}
