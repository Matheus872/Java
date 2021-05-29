package com.one.digital.inovation.springBoot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/")
    @CrossOrigin
    @ResponseStatus(code = HttpStatus.OK)
    public String helloMenssage(){
        return "Hello, Digital Inovation";
    }
}
