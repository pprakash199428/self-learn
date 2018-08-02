package com.self.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/testServer", method = RequestMethod.GET)
    String firstTest() {
        return "OK :" ;
    }
}
