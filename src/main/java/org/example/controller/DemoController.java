package org.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class DemoController {
    @RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
    public String index() {
    return "Holaaa!!";
    }
}
