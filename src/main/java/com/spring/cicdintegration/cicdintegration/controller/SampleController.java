package com.spring.cicdintegration.cicdintegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to CI/CD Integration";
    }
    /*
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/akintopbas/github-actions-example.git
    git push -u origin main

     */
}
