package com.example.EShoppingClientWithFeign.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
@FeignClient(value ="feignDemo", url="http://localhost:8888/payment/")

public interface ShoppingService {

    @GetMapping("/payNow/{price}")
    public String invokePaymentService(@PathVariable int price);

}
