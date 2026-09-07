package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
public class HomeController {

    @GetMapping("/call")
    public ResponseEntity<String> call(){
        return ResponseEntity.ok("Service A called");
    }
}
