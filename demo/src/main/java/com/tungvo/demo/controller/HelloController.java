package com.tungvo.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value  = "/hello", method = RequestMethod.GET)
    public String test(Authentication auth) {
        return String.format("Hello: %s", auth.getPrincipal());
    }
}
