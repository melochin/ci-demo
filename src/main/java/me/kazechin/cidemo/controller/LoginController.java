package me.kazechin.cidemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String check(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        throw new RuntimeException();
    }

}
