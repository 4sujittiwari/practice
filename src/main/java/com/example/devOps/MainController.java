package com.example.devOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping("/hello")
    public String getName(@RequestBody UserDetail userDetail){
        return "Hello "+userDetail.getUsername();
    }
}
