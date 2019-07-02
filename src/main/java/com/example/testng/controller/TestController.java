package com.example.testng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/s")
    public Map<String,Object> test(String str){
        Map<String,Object> re=new HashMap<>();
        re.put("code","123");
        re.put("data","dsfew");
        return re;
    }
}
