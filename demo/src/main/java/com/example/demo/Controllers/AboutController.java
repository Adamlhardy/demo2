package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



// Renamed the file to fit the about criteria
@Controller
public class AboutController {
    
    // linked the about.html to this controller
    @GetMapping("/about")

    // method to return the about page
    public String about() {
        return "about";
        
    }
}
