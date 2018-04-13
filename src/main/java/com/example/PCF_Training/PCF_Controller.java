package com.example.PCF_Training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PCF_Controller {

    @GetMapping("/")
    public String default_func() {
        return "default";
    }

    @GetMapping("/name")
    public String getName() {
        return "Ritu";
    }
}
