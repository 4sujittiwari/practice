package com.example.devOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("hello/{name}")
    public String getName(@PathVariable String name){
        return "<h1>Hello "+name+ "!!</h1>";
    }
}
