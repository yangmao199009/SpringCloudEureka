package com.example.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {
    @Autowired
    private RestTemplate template;

    @GetMapping("/shoppingPayment/{price}")
    public String invokePaymentService(@PathVariable  int price){
         String url = "http://PAYMENT-SERVICE/payment/payNow/"+price;
        return template.getForObject(url,String.class);
    }
}
