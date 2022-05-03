package com.example.SpringCloudEurekaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class ServiceController {

    @GetMapping("/payNow/{price}")
    public String payNow(@PathVariable int price){
        return "payment with"+price+" is successful";
    }
}
