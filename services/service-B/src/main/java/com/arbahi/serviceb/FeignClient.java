package com.arbahi.serviceb;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "service-a", url = "http://localhost:8081")
public interface FeignClient {
    @GetMapping("/api/service-a/greet")
    String getGreeting();
}
