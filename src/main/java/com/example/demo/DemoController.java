package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${vcap.services.eqb-onboarding-credhub.credentials.user}")
    public String user;

    @GetMapping("/")
    public ResponseEntity getRoot() {
        return ResponseEntity.ok("user: "+ user);
    }


}
