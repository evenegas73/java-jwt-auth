package com.venegas.interviewassistant.interview.assistant.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloWorldController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        String user = SecurityContextHolder.getContext().getAuthentication().getName();
        Object claims = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        return "Hello World";
    }

}
