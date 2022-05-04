package com.example.EShoppingClientWithFeign.app.controller;

import com.example.EShoppingClientWithFeign.app.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EShoppingController {
    @Autowired
    private ShoppingService shoppingService;
    @GetMapping("/payNow/{price}")
    @ResponseBody
    public String invokePaymentService(@PathVariable int price){

        return  shoppingService.invokePaymentService(price);
    }
}
