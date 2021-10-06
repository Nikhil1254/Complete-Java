package com.practice.my_web_app;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home() {
        System.out.println("You are on home page.");
        return "home";
    }
}
