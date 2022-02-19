package com.practice.my_web_app;

import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(Alien alien) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("home");
        return mv;
    }
}