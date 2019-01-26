package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Rest {

    @RequestMapping("/get")
    public String get() {
        return "шалом";
    }
}
