package com.project.billboardusagesystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/secured")
public class MainController {
    @GetMapping("/hello")
    public String hello(){
        return "<h2>Hello!</h2>";
    }

    @GetMapping("/user_page")
    public String user(){
        return "<h2>User page</<h2>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h2>Admin page</<h2>";
    }

    @GetMapping("/user")
    public String userAccess(Principal principal){
        if(principal == null)
            return null;
        return principal.getName();
    }

    @GetMapping("/user/email")
    public String userAccessEmail(Principal principal){
        if(principal == null)
            return null;
        return principal.getName();
    }
}
