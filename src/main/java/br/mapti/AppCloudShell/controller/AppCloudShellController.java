package br.mapti.AppCloudShell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppCloudShellController {

    @GetMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }


}
