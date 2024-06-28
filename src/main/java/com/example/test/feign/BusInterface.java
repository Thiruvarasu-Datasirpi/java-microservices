package com.example.test.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "BUSINFO" ,url="http://localhost:8081/bus/auth/")
public interface BusInterface {

    @PostMapping("signup")
    ResponseEntity<User> register(@RequestBody BusDto registerUserDto);
}
