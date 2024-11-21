package com.arbahi.servicec;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "service-b",url = "http://localhost:8082")
public interface FeignClient {
    @GetMapping("/api/service-b/call-service-a")
    String getGreetFromServiceB();
}
