package com.owen.springboot.helloworldonheroku.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author yuchlin on 3/8/20
 */

@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello world! Time on server is " + LocalDateTime.now();
    }

}
