package com.example.test.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private BusInterface busInterface;

    @PostMapping("/tests")
    public ResponseEntity<User> test(@RequestBody BusDto busDto) {
        return busInterface.register(busDto);
    }
}
