package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping({"home", "/", ""})
    public String home() {
        log.debug("home method called");
        return "home.html";
    }
}
