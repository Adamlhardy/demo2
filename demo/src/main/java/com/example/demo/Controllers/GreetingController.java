package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class GreetingController {
    
    // http://localhost:3000/greeting?name=Adam - changes "Hello, World!" to "Hello, Adam!" by changing the name parameter
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue= "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
        
    }
}
