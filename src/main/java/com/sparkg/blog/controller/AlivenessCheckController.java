package com.sparkg.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aliveness_check")
public class AlivenessCheckController {
    @GetMapping("/alive")
    public boolean isApplicationAlive() {
        return true;
    }
}
