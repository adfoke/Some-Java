package com.adfoke.testspr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String Say(){
        return "hi,world!";

    }
    
}
