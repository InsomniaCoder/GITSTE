package com.insomniacoder.te.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LogInController {

    @GetMapping(value="/login")
    public String printWelcome(Principal principal ) {

        return principal.getName(); //get logged in username
    }
}
