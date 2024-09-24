package com.kvasirsg.hellogithubactions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
    @GetMapping("/user")
    public String user() {
        return "user";
    }
}
