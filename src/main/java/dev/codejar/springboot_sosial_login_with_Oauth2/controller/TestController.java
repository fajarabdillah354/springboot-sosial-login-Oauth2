package dev.codejar.springboot_sosial_login_with_Oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/")
    public String hello(){
        return "Hello page";
    }


    @GetMapping("/secured")
    public String secured(){
        return "Secured page";
    }

}
