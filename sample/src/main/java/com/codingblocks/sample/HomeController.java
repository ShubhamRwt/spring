package com.codingblocks.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HomeController {


    @GetMapping("hello")
    public String first(){
        return "Hello from server";
    }
}
